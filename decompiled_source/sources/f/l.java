package f;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f2331a = Logger.getLogger(l.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class a implements s {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f2332b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OutputStream f2333c;

        a(u uVar, OutputStream outputStream) {
            this.f2332b = uVar;
            this.f2333c = outputStream;
        }

        @Override // f.s
        public u b() {
            return this.f2332b;
        }

        @Override // f.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f2333c.close();
        }

        @Override // f.s
        public void e(f.c cVar, long j) {
            v.b(cVar.f2313c, 0L, j);
            while (j > 0) {
                this.f2332b.f();
                p pVar = cVar.f2312b;
                int min = (int) Math.min(j, pVar.f2345c - pVar.f2344b);
                this.f2333c.write(pVar.f2343a, pVar.f2344b, min);
                int i = pVar.f2344b + min;
                pVar.f2344b = i;
                long j2 = min;
                j -= j2;
                cVar.f2313c -= j2;
                if (i == pVar.f2345c) {
                    cVar.f2312b = pVar.b();
                    q.a(pVar);
                }
            }
        }

        @Override // f.s, java.io.Flushable
        public void flush() {
            this.f2333c.flush();
        }

        public String toString() {
            return "sink(" + this.f2333c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class b implements t {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f2334b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InputStream f2335c;

        b(u uVar, InputStream inputStream) {
            this.f2334b = uVar;
            this.f2335c = inputStream;
        }

        @Override // f.t
        public u b() {
            return this.f2334b;
        }

        @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f2335c.close();
        }

        @Override // f.t
        public long i(f.c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (j == 0) {
                return 0L;
            }
            try {
                this.f2334b.f();
                p Q = cVar.Q(1);
                int read = this.f2335c.read(Q.f2343a, Q.f2345c, (int) Math.min(j, 8192 - Q.f2345c));
                if (read == -1) {
                    return -1L;
                }
                Q.f2345c += read;
                long j2 = read;
                cVar.f2313c += j2;
                return j2;
            } catch (AssertionError e2) {
                if (l.c(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
        }

        public String toString() {
            return "source(" + this.f2335c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class c extends f.a {
        final /* synthetic */ Socket k;

        c(Socket socket) {
            this.k = socket;
        }

        @Override // f.a
        protected IOException o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a
        protected void t() {
            Level level;
            StringBuilder sb;
            Logger logger;
            Exception exc;
            try {
                this.k.close();
            } catch (AssertionError e2) {
                if (!l.c(e2)) {
                    throw e2;
                }
                Logger logger2 = l.f2331a;
                level = Level.WARNING;
                sb = new StringBuilder();
                exc = e2;
                logger = logger2;
                sb.append("Failed to close timed out socket ");
                sb.append(this.k);
                logger.log(level, sb.toString(), (Throwable) exc);
            } catch (Exception e3) {
                Logger logger3 = l.f2331a;
                level = Level.WARNING;
                sb = new StringBuilder();
                exc = e3;
                logger = logger3;
                sb.append("Failed to close timed out socket ");
                sb.append(this.k);
                logger.log(level, sb.toString(), (Throwable) exc);
            }
        }
    }

    private l() {
    }

    public static d a(s sVar) {
        return new n(sVar);
    }

    public static e b(t tVar) {
        return new o(tVar);
    }

    static boolean c(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    private static s d(OutputStream outputStream, u uVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (uVar != null) {
            return new a(uVar, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static s e(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        f.a i = i(socket);
        return i.r(d(socket.getOutputStream(), i));
    }

    public static t f(InputStream inputStream) {
        return g(inputStream, new u());
    }

    private static t g(InputStream inputStream, u uVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (uVar != null) {
            return new b(uVar, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static t h(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        f.a i = i(socket);
        return i.s(g(socket.getInputStream(), i));
    }

    private static f.a i(Socket socket) {
        return new c(socket);
    }
}
