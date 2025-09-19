package org.chromium.support_lib_boundary.a;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* loaded from: classes.dex */
public class a {

    /* renamed from: org.chromium.support_lib_boundary.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0086a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final Object f2900a;

        public C0086a(Object obj) {
            this.f2900a = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return a.d(method, this.f2900a.getClass().getClassLoader()).invoke(this.f2900a, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getTargetException();
            } catch (ReflectiveOperationException e3) {
                throw new RuntimeException("Reflection failed for method " + method, e3);
            }
        }
    }

    public static <T> T a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean b(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (e()) {
                if (collection.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }

    public static InvocationHandler c(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0086a(obj);
    }

    public static Method d(Method method, ClassLoader classLoader) {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    private static boolean e() {
        return "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
    }
}
