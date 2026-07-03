package p092m;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import p001a0.AbstractC0094y0;
import p001a0.C0031h1;
import p032d6.C0572t;
import p035e1.C0677s;
import p073j2.AbstractC2168e;
import p085l0.C2395p;
import p139s1.AbstractC3088a;
import p144t.AbstractC3122c;
import p149t4.C3275l;
import p158u5.AbstractC3367j;
import p162v1.C3504h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2487d {
    /* renamed from: a */
    public static boolean m4037a(int i7, int i8, int i9) {
        switch (i7) {
            case 1:
                if (((i8 + i9) & 1) == 0) {
                    return true;
                }
                return false;
            case 2:
                if ((i8 & 1) == 0) {
                    return true;
                }
                return false;
            case 3:
                if (i9 % 3 == 0) {
                    return true;
                }
                return false;
            case 4:
                if ((i8 + i9) % 3 == 0) {
                    return true;
                }
                return false;
            case AbstractC3122c.f15761f /* 5 */:
                if ((((i9 / 3) + (i8 / 2)) & 1) == 0) {
                    return true;
                }
                return false;
            case AbstractC3122c.f15759d /* 6 */:
                if ((i8 * i9) % 6 == 0) {
                    return true;
                }
                return false;
            case 7:
                if ((i8 * i9) % 6 < 3) {
                    return true;
                }
                return false;
            default:
                if (((((i8 * i9) % 3) + i8 + i9) & 1) == 0) {
                    return true;
                }
                return false;
        }
    }

    /* renamed from: b */
    public static int m4038b(float f7, int i7, int i8) {
        return (Float.hashCode(f7) + i7) * i8;
    }

    /* renamed from: c */
    public static int m4039c(int i7, int i8, long j6) {
        return (Long.hashCode(j6) + i7) * i8;
    }

    /* renamed from: d */
    public static int m4040d(int i7, int i8, boolean z7) {
        return (Boolean.hashCode(z7) + i7) * i8;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [d6.t, java.lang.RuntimeException] */
    /* renamed from: e */
    public static C0572t m4041e(String str) {
        AbstractC3088a.m4751c(str);
        return new RuntimeException();
    }

    /* renamed from: f */
    public static String m4042f(String str, float f7, String str2) {
        return str + f7 + str2;
    }

    /* renamed from: g */
    public static String m4043g(String str, String str2) {
        return str + str2;
    }

    /* renamed from: h */
    public static String m4044h(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: i */
    public static String m4045i(StringBuilder sb, int i7, char c7) {
        sb.append(i7);
        sb.append(c7);
        return sb.toString();
    }

    /* renamed from: j */
    public static String m4046j(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: k */
    public static /* synthetic */ void m4047k(int i7) {
        if (i7 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        AbstractC3367j.m5104i(nullPointerException, AbstractC3367j.class.getName());
        throw nullPointerException;
    }

    /* renamed from: l */
    public static void m4048l(int i7, int i8, int i9, int i10, int i11) {
        AbstractC2168e.m3517d(i7);
        AbstractC2168e.m3517d(i8);
        AbstractC2168e.m3517d(i9);
        AbstractC2168e.m3517d(i10);
        AbstractC2168e.m3517d(i11);
    }

    /* renamed from: m */
    public static void m4049m(int i7, HashMap hashMap, String str, int i8, String str2) {
        hashMap.put(str, C3275l.m4987b(i7));
        hashMap.put(str2, C3275l.m4987b(i8));
    }

    /* renamed from: n */
    public static void m4050n(int i7, C2395p c2395p, int i8, C3504h c3504h) {
        c2395p.m3877j0(Integer.valueOf(i7));
        c2395p.m3860b(Integer.valueOf(i8), c3504h);
    }

    /* renamed from: o */
    public static void m4051o(long j6, StringBuilder sb, String str) {
        sb.append((Object) C0677s.m1460i(j6));
        sb.append(str);
    }

    /* renamed from: p */
    public static void m4052p(C0031h1 c0031h1, long j6) {
        c0031h1.m106u().mo1338j();
        c0031h1.m86J(j6);
    }

    /* renamed from: q */
    public static /* synthetic */ void m4053q(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z7 = false;
                while (!isTerminated) {
                    try {
                        isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z7) {
                            executorService.shutdownNow();
                            z7 = true;
                        }
                    }
                }
                if (z7) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
            }
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
        } else if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
        } else {
            if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m4054r(Object obj) {
        if (obj == null) {
        } else {
            throw new ClassCastException();
        }
    }

    /* renamed from: s */
    public static /* synthetic */ void m4055s(String str, int i7) {
        if (i7 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC3367j.class.getName();
            int i8 = 0;
            while (!stackTrace[i8].getClassName().equals(name)) {
                i8++;
            }
            while (stackTrace[i8].getClassName().equals(name)) {
                i8++;
            }
            StackTraceElement stackTraceElement = stackTrace[i8];
            StringBuilder m189p = AbstractC0094y0.m189p("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            m189p.append(str);
            NullPointerException nullPointerException = new NullPointerException(m189p.toString());
            AbstractC3367j.m5104i(nullPointerException, AbstractC3367j.class.getName());
            throw nullPointerException;
        }
    }

    /* renamed from: t */
    public static void m4056t(StringBuilder sb, String str, long j6, String str2) {
        sb.append(str);
        sb.append(j6);
        sb.append(str2);
    }

    /* renamed from: u */
    public static void m4057u(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    /* renamed from: v */
    public static String m4058v(String str, String str2) {
        return str + str2;
    }
}
