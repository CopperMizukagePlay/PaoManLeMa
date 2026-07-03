package p158u5;

import java.util.Arrays;
import p001a0.AbstractC0094y0;
import p015b6.C0296c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u5.j */
/* loaded from: classes.dex */
public abstract class AbstractC3367j {
    /* renamed from: a */
    public static boolean m5096a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m5097b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m5104i(nullPointerException, AbstractC3367j.class.getName());
        throw nullPointerException;
    }

    /* renamed from: c */
    public static void m5098c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m5104i(nullPointerException, AbstractC3367j.class.getName());
        throw nullPointerException;
    }

    /* renamed from: d */
    public static void m5099d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m5104i(nullPointerException, AbstractC3367j.class.getName());
        throw nullPointerException;
    }

    /* renamed from: e */
    public static void m5100e(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC3367j.class.getName();
            int i7 = 0;
            while (!stackTrace[i7].getClassName().equals(name)) {
                i7++;
            }
            while (stackTrace[i7].getClassName().equals(name)) {
                i7++;
            }
            StackTraceElement stackTraceElement = stackTrace[i7];
            StringBuilder m189p = AbstractC0094y0.m189p("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            m189p.append(str);
            NullPointerException nullPointerException = new NullPointerException(m189p.toString());
            m5104i(nullPointerException, AbstractC3367j.class.getName());
            throw nullPointerException;
        }
    }

    /* renamed from: f */
    public static int m5101f(int i7, int i8) {
        if (i7 < i8) {
            return -1;
        }
        if (i7 == i8) {
            return 0;
        }
        return 1;
    }

    /* renamed from: g */
    public static int m5102g(long j6, long j7) {
        if (j6 < j7) {
            return -1;
        }
        if (j6 == j7) {
            return 0;
        }
        return 1;
    }

    /* renamed from: h */
    public static final C0296c m5103h(Object[] objArr) {
        m5100e(objArr, "array");
        return new C0296c(objArr);
    }

    /* renamed from: i */
    public static void m5104i(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i7 = -1;
        for (int i8 = 0; i8 < length; i8++) {
            if (str.equals(stackTrace[i8].getClassName())) {
                i7 = i8;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i7 + 1, length));
    }

    /* renamed from: j */
    public static void m5105j(String str) {
        RuntimeException runtimeException = new RuntimeException(AbstractC0094y0.m185l("lateinit property ", str, " has not been initialized"));
        m5104i(runtimeException, AbstractC3367j.class.getName());
        throw runtimeException;
    }
}
