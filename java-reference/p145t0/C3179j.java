package p145t0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p017c.C0320e;
import p068i5.AbstractC2080d;
import p077k.AbstractC2212q0;
import p077k.C2194h0;
import p077k.C2196i0;
import p085l0.C2420w1;
import p085l0.InterfaceC2367i;
import p085l0.InterfaceC2417v1;
import p101n0.C2705e;
import p150t5.InterfaceC3277a;
import p169w0.C3645b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t0.j */
/* loaded from: classes.dex */
public final class C3179j {

    /* renamed from: a */
    public Set f15892a;

    /* renamed from: b */
    public C3645b f15893b;

    /* renamed from: c */
    public final C2705e f15894c;

    /* renamed from: d */
    public C2196i0 f15895d;

    /* renamed from: e */
    public C2705e f15896e;

    /* renamed from: f */
    public final C2705e f15897f;

    /* renamed from: g */
    public final C2705e f15898g;

    /* renamed from: h */
    public C2196i0 f15899h;

    /* renamed from: i */
    public C2194h0 f15900i;

    /* renamed from: j */
    public ArrayList f15901j;

    /* renamed from: k */
    public C2196i0 f15902k;

    public C3179j() {
        C2705e c2705e = new C2705e(new C2420w1[16]);
        this.f15894c = c2705e;
        int i7 = AbstractC2212q0.f12726a;
        this.f15895d = new C2196i0();
        this.f15896e = c2705e;
        this.f15897f = new C2705e(new Object[16]);
        this.f15898g = new C2705e(new InterfaceC3277a[16]);
    }

    /* renamed from: a */
    public final void m4875a() {
        this.f15892a = null;
        this.f15893b = null;
        C2705e c2705e = this.f15894c;
        c2705e.m4305g();
        this.f15895d.m3600b();
        this.f15896e = c2705e;
        this.f15897f.m4305g();
        this.f15898g.m4305g();
        this.f15899h = null;
        this.f15900i = null;
        this.f15901j = null;
    }

    /* renamed from: b */
    public final void m4876b() {
        Set set = this.f15892a;
        if (set != null && !set.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    InterfaceC2417v1 interfaceC2417v1 = (InterfaceC2417v1) it.next();
                    it.remove();
                    interfaceC2417v1.mo2780g();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    /* renamed from: c */
    public final void m4877c() {
        Set set = this.f15892a;
        if (set != null) {
            this.f15902k = null;
            C2705e c2705e = this.f15897f;
            if (c2705e.f14519g != 0) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    C2196i0 c2196i0 = this.f15899h;
                    int i7 = c2705e.f14519g;
                    while (true) {
                        i7--;
                        if (-1 >= i7) {
                            break;
                        }
                        Object obj = c2705e.f14517e[i7];
                        try {
                            if (obj instanceof C2420w1) {
                                InterfaceC2417v1 interfaceC2417v1 = ((C2420w1) obj).f13625a;
                                set.remove(interfaceC2417v1);
                                interfaceC2417v1.mo2781j();
                            }
                            if (obj instanceof InterfaceC2367i) {
                                if (c2196i0 != null && c2196i0.m3601c(obj)) {
                                    ((InterfaceC2367i) obj).mo3796a();
                                } else {
                                    ((InterfaceC2367i) obj).mo3797b();
                                }
                            }
                        } catch (Throwable th) {
                            C3645b c3645b = this.f15893b;
                            if (c3645b != null) {
                                AbstractC2080d.m3387O(th, new C0320e(29, c3645b, obj));
                            }
                            throw th;
                        }
                    }
                } finally {
                }
            }
            C2705e c2705e2 = this.f15894c;
            if (c2705e2.f14519g != 0) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    Set set2 = this.f15892a;
                    if (set2 != null) {
                        Object[] objArr = c2705e2.f14517e;
                        int i8 = c2705e2.f14519g;
                        for (int i9 = 0; i9 < i8; i9++) {
                            C2420w1 c2420w1 = (C2420w1) objArr[i9];
                            InterfaceC2417v1 interfaceC2417v12 = c2420w1.f13625a;
                            set2.remove(interfaceC2417v12);
                            try {
                                interfaceC2417v12.mo2779e();
                            } catch (Throwable th2) {
                                C3645b c3645b2 = this.f15893b;
                                if (c3645b2 != null) {
                                    AbstractC2080d.m3387O(th2, new C0320e(29, c3645b2, c2420w1));
                                }
                                throw th2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: d */
    public final void m4878d(C2420w1 c2420w1) {
        if (this.f15895d.m3601c(c2420w1)) {
            this.f15895d.m3609k(c2420w1);
            if (!this.f15896e.m4308j(c2420w1)) {
                C2705e c2705e = this.f15894c;
                if (!c2705e.m4308j(c2420w1)) {
                    Object[] objArr = c2705e.f14517e;
                    int i7 = c2705e.f14519g;
                    for (int i8 = 0; i8 < i7; i8++) {
                        if (((C2420w1) objArr[i8]).f13625a instanceof AbstractC3175f) {
                            throw null;
                        }
                    }
                }
            }
            Set set = this.f15892a;
            if (set != null) {
                set.add(c2420w1.f13625a);
            } else {
                return;
            }
        }
        C2196i0 c2196i0 = this.f15902k;
        if (c2196i0 != null && c2196i0.m3601c(c2420w1)) {
            return;
        }
        this.f15897f.m4300b(c2420w1);
    }

    /* renamed from: e */
    public final void m4879e(Set set, C3645b c3645b) {
        m4875a();
        this.f15892a = set;
        this.f15893b = c3645b;
    }
}
