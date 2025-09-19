package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.a;
import androidx.lifecycle.d;
import androidx.lifecycle.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class c extends ComponentActivity implements a.b, a.d {
    static final String ALLOCATED_REQUEST_INDICIES_TAG = "android:support:request_indicies";
    static final String FRAGMENTS_TAG = "android:support:fragments";
    static final int MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS = 65534;
    static final String NEXT_CANDIDATE_REQUEST_INDEX_TAG = "android:support:next_request_index";
    static final String REQUEST_FRAGMENT_WHO_TAG = "android:support:request_fragment_who";
    private static final String TAG = "FragmentActivity";
    boolean mCreated;
    final androidx.lifecycle.h mFragmentLifecycleRegistry;
    final e mFragments;
    int mNextCandidateRequestIndex;
    b.d.h<String> mPendingFragmentActivityResults;
    boolean mRequestedPermissionsFromFragment;
    boolean mResumed;
    boolean mStartedActivityFromFragment;
    boolean mStartedIntentSenderFromFragment;
    boolean mStopped;

    /* loaded from: classes.dex */
    class a extends g<c> implements s, androidx.activity.c {
        public a() {
            super(c.this);
        }

        @Override // androidx.fragment.app.g, androidx.fragment.app.d
        public View b(int i) {
            return c.this.findViewById(i);
        }

        @Override // androidx.fragment.app.g, androidx.fragment.app.d
        public boolean c() {
            Window window = c.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.g
        public void g(Fragment fragment) {
            c.this.onAttachFragment(fragment);
        }

        @Override // androidx.lifecycle.g
        public androidx.lifecycle.d getLifecycle() {
            return c.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return c.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.lifecycle.s
        public androidx.lifecycle.r getViewModelStore() {
            return c.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.g
        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            c.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.g
        public LayoutInflater j() {
            return c.this.getLayoutInflater().cloneInContext(c.this);
        }

        @Override // androidx.fragment.app.g
        public int k() {
            Window window = c.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.g
        public boolean l() {
            return c.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.g
        public boolean m(Fragment fragment) {
            return !c.this.isFinishing();
        }

        @Override // androidx.fragment.app.g
        public void n() {
            c.this.supportInvalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.g
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public c i() {
            return c.this;
        }
    }

    public c() {
        this.mFragments = e.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.h(this);
        this.mStopped = true;
    }

    public c(int i) {
        super(i);
        this.mFragments = e.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.h(this);
        this.mStopped = true;
    }

    private int allocateRequestIndex(Fragment fragment) {
        if (this.mPendingFragmentActivityResults.k() >= MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.mPendingFragmentActivityResults.g(this.mNextCandidateRequestIndex) >= 0) {
            this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS;
        }
        int i = this.mNextCandidateRequestIndex;
        this.mPendingFragmentActivityResults.i(i, fragment.f693f);
        this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS;
        return i;
    }

    static void checkForValidRequestCode(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), d.b.CREATED));
    }

    private static boolean markState(h hVar, d.b bVar) {
        boolean z = false;
        for (Fragment fragment : hVar.c()) {
            if (fragment != null) {
                if (fragment.getLifecycle().b().a(d.b.STARTED)) {
                    fragment.S.p(bVar);
                    z = true;
                }
                if (fragment.q() != null) {
                    z |= markState(fragment.j(), bVar);
                }
            }
        }
        return z;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.w(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            b.i.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.u().a(str, fileDescriptor, printWriter, strArr);
    }

    public h getSupportFragmentManager() {
        return this.mFragments.u();
    }

    @Deprecated
    public b.i.a.a getSupportLoaderManager() {
        return b.i.a.a.b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.v();
        int i3 = i >> 16;
        if (i3 == 0) {
            a.c j = androidx.core.app.a.j();
            if (j == null || !j.b(this, i, i2, intent)) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            return;
        }
        int i4 = i3 - 1;
        String e2 = this.mPendingFragmentActivityResults.e(i4);
        this.mPendingFragmentActivityResults.j(i4);
        if (e2 == null) {
            Log.w(TAG, "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment t = this.mFragments.t(e2);
        if (t != null) {
            t.O(i & 65535, i2, intent);
            return;
        }
        Log.w(TAG, "Activity result no fragment exists for who: " + e2);
    }

    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.v();
        this.mFragments.d(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mFragments.a(null);
        if (bundle != null) {
            this.mFragments.x(bundle.getParcelable(FRAGMENTS_TAG));
            if (bundle.containsKey(NEXT_CANDIDATE_REQUEST_INDEX_TAG)) {
                this.mNextCandidateRequestIndex = bundle.getInt(NEXT_CANDIDATE_REQUEST_INDEX_TAG);
                int[] intArray = bundle.getIntArray(ALLOCATED_REQUEST_INDICIES_TAG);
                String[] stringArray = bundle.getStringArray(REQUEST_FRAGMENT_WHO_TAG);
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w(TAG, "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.mPendingFragmentActivityResults = new b.d.h<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.mPendingFragmentActivityResults.i(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new b.d.h<>();
            this.mNextCandidateRequestIndex = 0;
        }
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.i(d.a.ON_CREATE);
        this.mFragments.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.mFragments.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.h();
        this.mFragmentLifecycleRegistry.i(d.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.k(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.j(z);
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.v();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m();
        this.mFragmentLifecycleRegistry.i(d.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.n(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? onPrepareOptionsPanel(view, menu) | this.mFragments.o(menu) : super.onPreparePanel(i, view, menu);
    }

    @Override // android.app.Activity, androidx.core.app.a.b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.v();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String e2 = this.mPendingFragmentActivityResults.e(i3);
            this.mPendingFragmentActivityResults.j(i3);
            if (e2 == null) {
                Log.w(TAG, "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t = this.mFragments.t(e2);
            if (t != null) {
                t.n0(i & 65535, strArr, iArr);
                return;
            }
            Log.w(TAG, "Activity result no fragment exists for who: " + e2);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.v();
        this.mFragments.s();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.i(d.a.ON_RESUME);
        this.mFragments.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.i(d.a.ON_STOP);
        Parcelable y = this.mFragments.y();
        if (y != null) {
            bundle.putParcelable(FRAGMENTS_TAG, y);
        }
        if (this.mPendingFragmentActivityResults.k() > 0) {
            bundle.putInt(NEXT_CANDIDATE_REQUEST_INDEX_TAG, this.mNextCandidateRequestIndex);
            int[] iArr = new int[this.mPendingFragmentActivityResults.k()];
            String[] strArr = new String[this.mPendingFragmentActivityResults.k()];
            for (int i = 0; i < this.mPendingFragmentActivityResults.k(); i++) {
                iArr[i] = this.mPendingFragmentActivityResults.h(i);
                strArr[i] = this.mPendingFragmentActivityResults.l(i);
            }
            bundle.putIntArray(ALLOCATED_REQUEST_INDICIES_TAG, iArr);
            bundle.putStringArray(REQUEST_FRAGMENT_WHO_TAG, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.v();
        this.mFragments.s();
        this.mFragmentLifecycleRegistry.i(d.a.ON_START);
        this.mFragments.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.r();
        this.mFragmentLifecycleRegistry.i(d.a.ON_STOP);
    }

    void requestPermissionsFromFragment(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            androidx.core.app.a.m(this, strArr, i);
            return;
        }
        checkForValidRequestCode(i);
        try {
            this.mRequestedPermissionsFromFragment = true;
            androidx.core.app.a.m(this, strArr, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535));
        } finally {
            this.mRequestedPermissionsFromFragment = false;
        }
    }

    public void setEnterSharedElementCallback(androidx.core.app.g gVar) {
        androidx.core.app.a.n(this, gVar);
    }

    public void setExitSharedElementCallback(androidx.core.app.g gVar) {
        androidx.core.app.a.o(this, gVar);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        this.mStartedActivityFromFragment = true;
        try {
            if (i == -1) {
                androidx.core.app.a.p(this, intent, -1, bundle);
            } else {
                checkForValidRequestCode(i);
                androidx.core.app.a.p(this, intent, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535), bundle);
            }
        } finally {
            this.mStartedActivityFromFragment = false;
        }
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.mStartedIntentSenderFromFragment = true;
        try {
            if (i == -1) {
                androidx.core.app.a.q(this, intentSender, i, intent, i2, i3, i4, bundle);
            } else {
                checkForValidRequestCode(i);
                androidx.core.app.a.q(this, intentSender, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535), intent, i2, i3, i4, bundle);
            }
        } finally {
            this.mStartedIntentSenderFromFragment = false;
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.a.i(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.a.k(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.a.r(this);
    }

    @Override // androidx.core.app.a.d
    public final void validateRequestPermissionsRequestCode(int i) {
        if (this.mRequestedPermissionsFromFragment || i == -1) {
            return;
        }
        checkForValidRequestCode(i);
    }
}
