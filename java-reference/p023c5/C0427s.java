package p023c5;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.net.Network;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Formatter;
import java.util.List;
import p001a0.C0068q2;
import p022c4.C0406p;
import p024c6.AbstractC0444k;
import p035e1.AbstractC0642a;
import p035e1.AbstractC0658i;
import p035e1.AbstractC0659i0;
import p035e1.C0666m;
import p039e5.C0918h0;
import p039e5.C1100ms;
import p039e5.C1203q7;
import p039e5.EnumC1127no;
import p053g5.C1689h;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p092m.AbstractC2487d;
import p099m6.InterfaceC2611l;
import p144t.AbstractC3122c;
import p158u5.AbstractC3367j;
import p165v4.C3587a;
import p165v4.C3589c;
import p165v4.C3591e;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c5.s */
/* loaded from: classes.dex */
public final class C0427s implements InterfaceC0422n, InterfaceC2611l {

    /* renamed from: j */
    public static C0427s f1459j;

    /* renamed from: e */
    public final /* synthetic */ int f1460e;

    /* renamed from: f */
    public int f1461f;

    /* renamed from: g */
    public Object f1462g;

    /* renamed from: h */
    public Object f1463h;

    /* renamed from: i */
    public Object f1464i;

    public /* synthetic */ C0427s(int i7) {
        this.f1460e = i7;
    }

    /* renamed from: a */
    public void m903a(C0068q2 c0068q2) {
        C0406p c0406p;
        C0406p c0406p2;
        boolean z7;
        if (c0068q2 != null) {
            C3591e c3591e = (C3591e) c0068q2;
            C3587a c3587a = (C3587a) this.f1462g;
            C3587a[] c3587aArr = (C3587a[]) c3591e.f345g;
            for (C3587a c3587a2 : c3587aArr) {
                if (c3587a2 != null) {
                    c3587a2.m5578b();
                }
            }
            c3591e.m5586I(c3587aArr, c3587a);
            C3589c c3589c = (C3589c) c3591e.f344f;
            boolean z8 = c3591e.f17244h;
            if (z8) {
                c0406p = c3589c.f17233b;
            } else {
                c0406p = c3589c.f17235d;
            }
            if (z8) {
                c0406p2 = c3589c.f17234c;
            } else {
                c0406p2 = c3589c.f17236e;
            }
            int m158y = c3591e.m158y((int) c0406p2.f1391b);
            int i7 = -1;
            int i8 = 1;
            int i9 = 0;
            for (int m158y2 = c3591e.m158y((int) c0406p.f1391b); m158y2 < m158y; m158y2++) {
                C3587a c3587a3 = c3587aArr[m158y2];
                if (c3587a3 != null) {
                    int i10 = c3587a3.f17230f;
                    int i11 = i10 - i7;
                    if (i11 == 0) {
                        i9++;
                    } else {
                        if (i11 == 1) {
                            i8 = Math.max(i8, i9);
                            i7 = c3587a3.f17230f;
                        } else if (i11 >= 0 && i10 < c3587a.f17230f && i11 <= m158y2) {
                            if (i8 > 2) {
                                i11 *= i8 - 2;
                            }
                            if (i11 >= m158y2) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            for (int i12 = 1; i12 <= i11 && !z7; i12++) {
                                if (c3587aArr[m158y2 - i12] != null) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                            }
                            if (z7) {
                                c3587aArr[m158y2] = null;
                            } else {
                                i7 = c3587a3.f17230f;
                            }
                        } else {
                            c3587aArr[m158y2] = null;
                        }
                        i9 = 1;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void m904b() {
        synchronized (this.f1464i) {
            try {
                if (((Handler) this.f1462g) == null) {
                    if (this.f1461f > 0) {
                        HandlerThread handlerThread = new HandlerThread("CameraThread");
                        this.f1463h = handlerThread;
                        handlerThread.start();
                        this.f1462g = new Handler(((HandlerThread) this.f1463h).getLooper());
                    } else {
                        throw new IllegalStateException("CameraThread is not open");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public void m905c(Runnable runnable) {
        synchronized (this.f1464i) {
            m904b();
            ((Handler) this.f1462g).post(runnable);
        }
    }

    /* renamed from: d */
    public int m906d() {
        int i7;
        Paint.Cap strokeCap = ((Paint) this.f1462g).getStrokeCap();
        if (strokeCap == null) {
            i7 = -1;
        } else {
            i7 = AbstractC0658i.f2145a[strokeCap.ordinal()];
        }
        if (i7 != 1) {
            if (i7 == 2) {
                return 1;
            }
            if (i7 == 3) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    @Override // p099m6.InterfaceC2611l
    /* renamed from: e */
    public List mo34e(String str) {
        Object m2985m;
        AbstractC3367j.m5100e(str, "hostname");
        String m945i0 = AbstractC0444k.m945i0(str, "[", "]");
        C1203q7 c1203q7 = (C1203q7) this.f1462g;
        if (c1203q7 != null) {
            Object obj = null;
            if (!C1100ms.m1920m0(c1203q7.f7046b).equals(C1100ms.m1920m0(m945i0))) {
                c1203q7 = null;
            }
            if (c1203q7 != null) {
                C1100ms c1100ms = (C1100ms) this.f1463h;
                try {
                    m2985m = InetAddress.getByName(c1203q7.f7047c);
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                if (!(m2985m instanceof C1689h)) {
                    obj = m2985m;
                }
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress != null && !C1100ms.m1900V(AbstractC3784a.m5817z(inetAddress), c1100ms.f6019G0).isEmpty()) {
                    return AbstractC3784a.m5817z(inetAddress);
                }
            }
        }
        List m1900V = C1100ms.m1900V(C1100ms.m1913g((C1100ms) this.f1463h, m945i0, (Network) this.f1464i), ((C1100ms) this.f1463h).f6019G0);
        if (!m1900V.isEmpty()) {
            if (this.f1461f > 0 && ((C1100ms) this.f1463h).f6019G0 == EnumC1127no.f6360g) {
                return AbstractC1805m.m3061y0(m1900V, new C0918h0(10));
            }
            return m1900V;
        }
        throw new UnknownHostException(AbstractC2487d.m4044h(((C1100ms) this.f1463h).f6019G0.f6365e, " 无可用地址：", str));
    }

    /* renamed from: f */
    public int m907f() {
        int i7;
        Paint.Join strokeJoin = ((Paint) this.f1462g).getStrokeJoin();
        if (strokeJoin == null) {
            i7 = -1;
        } else {
            i7 = AbstractC0658i.f2146b[strokeJoin.ordinal()];
        }
        if (i7 != 1) {
            if (i7 == 2) {
                return 2;
            }
            if (i7 == 3) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: g */
    public void m908g(float f7) {
        ((Paint) this.f1462g).setAlpha((int) Math.rint(f7 * 255.0f));
    }

    /* renamed from: h */
    public void m909h(int i7) {
        if (this.f1461f == i7) {
            return;
        }
        this.f1461f = i7;
        Paint paint = (Paint) this.f1462g;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0642a.m1314m(paint, AbstractC0659i0.m1422v(i7));
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC0659i0.m1397D(i7)));
        }
    }

    /* renamed from: i */
    public void m910i(long j6) {
        ((Paint) this.f1462g).setColor(AbstractC0659i0.m1426z(j6));
    }

    /* renamed from: j */
    public void m911j(C0666m c0666m) {
        ColorFilter colorFilter;
        this.f1464i = c0666m;
        Paint paint = (Paint) this.f1462g;
        if (c0666m != null) {
            colorFilter = c0666m.f2180a;
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    /* renamed from: k */
    public void m912k(int i7) {
        boolean z7;
        Paint paint = (Paint) this.f1462g;
        if (i7 == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        paint.setFilterBitmap(!z7);
    }

    /* renamed from: l */
    public void m913l(Shader shader) {
        this.f1463h = shader;
        ((Paint) this.f1462g).setShader(shader);
    }

    /* renamed from: m */
    public void m914m(int i7) {
        Paint.Cap cap;
        Paint paint = (Paint) this.f1462g;
        if (i7 == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i7 == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i7 == 0) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    /* renamed from: n */
    public void m915n(int i7) {
        Paint.Join join;
        Paint paint = (Paint) this.f1462g;
        if (i7 == 0) {
            join = Paint.Join.MITER;
        } else if (i7 == 2) {
            join = Paint.Join.BEVEL;
        } else if (i7 == 1) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    /* renamed from: o */
    public void m916o(float f7) {
        ((Paint) this.f1462g).setStrokeWidth(f7);
    }

    /* renamed from: p */
    public void m917p(int i7) {
        Paint.Style style;
        Paint paint = (Paint) this.f1462g;
        if (i7 == 1) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }

    public String toString() {
        switch (this.f1460e) {
            case AbstractC3122c.f15761f /* 5 */:
                int i7 = this.f1461f;
                C0068q2[] c0068q2Arr = (C0068q2[]) this.f1463h;
                C0068q2 c0068q2 = c0068q2Arr[0];
                if (c0068q2 == null) {
                    c0068q2 = c0068q2Arr[i7 + 1];
                }
                Formatter formatter = new Formatter();
                for (int i8 = 0; i8 < ((C3587a[]) c0068q2.f345g).length; i8++) {
                    try {
                        formatter.format("CW %3d:", Integer.valueOf(i8));
                        for (int i9 = 0; i9 < i7 + 2; i9++) {
                            C0068q2 c0068q22 = c0068q2Arr[i9];
                            if (c0068q22 == null) {
                                formatter.format("    |   ", new Object[0]);
                            } else {
                                C3587a c3587a = ((C3587a[]) c0068q22.f345g)[i8];
                                if (c3587a == null) {
                                    formatter.format("    |   ", new Object[0]);
                                } else {
                                    formatter.format(" %3d|%3d", Integer.valueOf(c3587a.f17230f), Integer.valueOf(c3587a.f17229e));
                                }
                            }
                        }
                        formatter.format("%n", new Object[0]);
                    } finally {
                    }
                }
                String formatter2 = formatter.toString();
                formatter.close();
                return formatter2;
            default:
                return super.toString();
        }
    }

    public C0427s() {
        this.f1460e = 2;
        this.f1461f = 0;
        this.f1464i = new Object();
    }

    public C0427s(C3587a c3587a, C3589c c3589c) {
        this.f1460e = 5;
        this.f1462g = c3587a;
        int i7 = c3587a.f17226b;
        this.f1461f = i7;
        this.f1464i = c3589c;
        this.f1463h = new C0068q2[i7 + 2];
    }

    public C0427s(Paint paint) {
        this.f1460e = 3;
        this.f1462g = paint;
        this.f1461f = 3;
    }

    public C0427s(C1203q7 c1203q7, C1100ms c1100ms, Network network, int i7) {
        this.f1460e = 4;
        this.f1462g = c1203q7;
        this.f1463h = c1100ms;
        this.f1464i = network;
        this.f1461f = i7;
    }
}
