package p153u0;

import p001a0.C0031h1;
import p008b.C0226c0;
import p085l0.C2413u0;
import p085l0.InterfaceC2417v1;
import p161v0.InterfaceC3467n;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u0.a */
/* loaded from: classes.dex */
public final class C3334a implements InterfaceC2417v1 {

    /* renamed from: e */
    public InterfaceC3342i f16385e;

    /* renamed from: f */
    public InterfaceC3338e f16386f;

    /* renamed from: g */
    public String f16387g;

    /* renamed from: h */
    public Object f16388h;

    /* renamed from: i */
    public Object[] f16389i;

    /* renamed from: j */
    public InterfaceC3337d f16390j;

    /* renamed from: k */
    public final C0226c0 f16391k = new C0226c0(15, this);

    public C3334a(InterfaceC3342i interfaceC3342i, InterfaceC3338e interfaceC3338e, String str, Object obj, Object[] objArr) {
        this.f16385e = interfaceC3342i;
        this.f16386f = interfaceC3338e;
        this.f16387g = str;
        this.f16388h = obj;
        this.f16389i = objArr;
    }

    /* renamed from: a */
    public final void m5071a() {
        String m5078a;
        InterfaceC3338e interfaceC3338e = this.f16386f;
        if (this.f16390j == null) {
            if (interfaceC3338e != null) {
                C0226c0 c0226c0 = this.f16391k;
                Object mo52a = c0226c0.mo52a();
                if (mo52a != null && !interfaceC3338e.mo5074c(mo52a)) {
                    if (mo52a instanceof InterfaceC3467n) {
                        InterfaceC3467n interfaceC3467n = (InterfaceC3467n) mo52a;
                        if (interfaceC3467n.mo3728d() != C2413u0.f13572g && interfaceC3467n.mo3728d() != C2413u0.f13575j && interfaceC3467n.mo3728d() != C2413u0.f13573h) {
                            m5078a = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        } else {
                            m5078a = "MutableState containing " + interfaceC3467n.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                        }
                    } else {
                        m5078a = AbstractC3344k.m5078a(mo52a);
                    }
                    throw new IllegalArgumentException(m5078a);
                }
                this.f16390j = interfaceC3338e.mo5077f(this.f16387g, c0226c0);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.f16390j + ") is not null").toString());
    }

    @Override // p085l0.InterfaceC2417v1
    /* renamed from: e */
    public final void mo2779e() {
        m5071a();
    }

    @Override // p085l0.InterfaceC2417v1
    /* renamed from: g */
    public final void mo2780g() {
        InterfaceC3337d interfaceC3337d = this.f16390j;
        if (interfaceC3337d != null) {
            ((C0031h1) interfaceC3337d).m87K();
        }
    }

    @Override // p085l0.InterfaceC2417v1
    /* renamed from: j */
    public final void mo2781j() {
        InterfaceC3337d interfaceC3337d = this.f16390j;
        if (interfaceC3337d != null) {
            ((C0031h1) interfaceC3337d).m87K();
        }
    }
}
