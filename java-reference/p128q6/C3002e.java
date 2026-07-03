package p128q6;

import java.io.IOException;
import java.net.Socket;
import p006a7.C0137t;
import p006a7.C0138u;
import p067i4.C2071d;
import p085l0.C2345c1;
import p085l0.C2349d1;
import p099m6.AbstractC2614o;
import p099m6.C2596c0;
import p099m6.C2598d0;
import p136r6.C3071h;
import p136r6.InterfaceC3068e;
import p151t6.C3285a;
import p151t6.C3288b0;
import p158u5.AbstractC3367j;
import p160v.C3419k0;
import p168w.AbstractC3642y;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q6.e */
/* loaded from: classes.dex */
public final class C3002e {

    /* renamed from: a */
    public boolean f15483a;

    /* renamed from: b */
    public final Object f15484b;

    /* renamed from: c */
    public final Object f15485c;

    /* renamed from: d */
    public final Object f15486d;

    /* renamed from: e */
    public Object f15487e;

    /* renamed from: f */
    public final Object f15488f;

    public C3002e(int i7, float f7, AbstractC3642y abstractC3642y) {
        this.f15484b = abstractC3642y;
        this.f15485c = new C2349d1(i7);
        this.f15486d = new C2345c1(f7);
        this.f15488f = new C3419k0(i7);
    }

    /* renamed from: a */
    public IOException m4672a(boolean z7, boolean z8, IOException iOException) {
        AbstractC2614o abstractC2614o = (AbstractC2614o) this.f15485c;
        C3006i c3006i = (C3006i) this.f15484b;
        if (iOException != null) {
            m4676e(iOException);
        }
        if (z8) {
            if (iOException != null) {
                abstractC2614o.getClass();
            } else {
                abstractC2614o.getClass();
            }
        }
        if (z7) {
            if (iOException != null) {
                abstractC2614o.getClass();
            } else {
                abstractC2614o.getClass();
            }
        }
        return c3006i.m4684h(this, z8, z7, iOException);
    }

    /* renamed from: b */
    public C3008k m4673b() {
        C3006i c3006i = (C3006i) this.f15484b;
        if (!c3006i.f15504o) {
            c3006i.f15504o = true;
            c3006i.f15499j.m234j();
            C3009l mo4706h = ((InterfaceC3068e) this.f15487e).mo4706h();
            mo4706h.getClass();
            Socket socket = mo4706h.f15518d;
            AbstractC3367j.m5097b(socket);
            C0138u c0138u = mo4706h.f15522h;
            AbstractC3367j.m5097b(c0138u);
            C0137t c0137t = mo4706h.f15523i;
            AbstractC3367j.m5097b(c0137t);
            socket.setSoTimeout(0);
            mo4706h.m4697k();
            return new C3008k(c0138u, c0137t, this);
        }
        throw new IllegalStateException("Check failed.");
    }

    /* renamed from: c */
    public C3071h m4674c(C2598d0 c2598d0) {
        InterfaceC3068e interfaceC3068e = (InterfaceC3068e) this.f15487e;
        try {
            String m4141b = C2598d0.m4141b("Content-Type", c2598d0);
            long mo4699a = interfaceC3068e.mo4699a(c2598d0);
            return new C3071h(m4141b, mo4699a, new C0138u(new C3001d(this, interfaceC3068e.mo4701c(c2598d0), mo4699a)));
        } catch (IOException e7) {
            ((AbstractC2614o) this.f15485c).getClass();
            m4676e(e7);
            throw e7;
        }
    }

    /* renamed from: d */
    public C2596c0 m4675d(boolean z7) {
        try {
            C2596c0 mo4705g = ((InterfaceC3068e) this.f15487e).mo4705g(z7);
            if (mo4705g != null) {
                mo4705g.f14041m = this;
                return mo4705g;
            }
            return mo4705g;
        } catch (IOException e7) {
            ((AbstractC2614o) this.f15485c).getClass();
            m4676e(e7);
            throw e7;
        }
    }

    /* renamed from: e */
    public void m4676e(IOException iOException) {
        boolean z7;
        this.f15483a = true;
        ((C2071d) this.f15486d).m3324c(iOException);
        C3009l mo4706h = ((InterfaceC3068e) this.f15487e).mo4706h();
        C3006i c3006i = (C3006i) this.f15484b;
        synchronized (mo4706h) {
            try {
                if (iOException instanceof C3288b0) {
                    if (((C3288b0) iOException).f16141e == 8) {
                        int i7 = mo4706h.f15528n + 1;
                        mo4706h.f15528n = i7;
                        if (i7 > 1) {
                            mo4706h.f15524j = true;
                            mo4706h.f15526l++;
                        }
                    } else if (((C3288b0) iOException).f16141e != 9 || !c3006i.f15509t) {
                        mo4706h.f15524j = true;
                        mo4706h.f15526l++;
                    }
                } else {
                    if (mo4706h.f15521g != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (!z7 || (iOException instanceof C3285a)) {
                        mo4706h.f15524j = true;
                        if (mo4706h.f15527m == 0) {
                            C3009l.m4687d(c3006i.f15494e, mo4706h.f15516b, iOException);
                            mo4706h.f15526l++;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C3002e(C3006i c3006i, AbstractC2614o abstractC2614o, C2071d c2071d, InterfaceC3068e interfaceC3068e) {
        AbstractC3367j.m5100e(abstractC2614o, "eventListener");
        AbstractC3367j.m5100e(c2071d, "finder");
        this.f15484b = c3006i;
        this.f15485c = abstractC2614o;
        this.f15486d = c2071d;
        this.f15487e = interfaceC3068e;
        this.f15488f = interfaceC3068e.mo4706h();
    }
}
