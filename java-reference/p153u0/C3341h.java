package p153u0;

import android.os.Bundle;
import androidx.lifecycle.C0216v;
import java.util.Map;
import p008b.C0226c0;
import p150t5.InterfaceC3277a;
import p172w3.C3781e;
import p172w3.InterfaceC3782f;
import p186y3.C3850a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u0.h */
/* loaded from: classes.dex */
public final class C3341h implements InterfaceC3338e, InterfaceC3782f {

    /* renamed from: e */
    public final /* synthetic */ C3339f f16401e;

    /* renamed from: f */
    public final C3781e f16402f;

    /* renamed from: g */
    public final C0216v f16403g;

    /* renamed from: h */
    public final C3781e f16404h;

    public C3341h(C3339f c3339f) {
        Bundle bundle;
        this.f16401e = c3339f;
        C3781e c3781e = new C3781e(new C3850a(this, new C0226c0(18, this)), 1);
        this.f16402f = c3781e;
        this.f16403g = new C0216v(this, false);
        this.f16404h = (C3781e) c3781e.f17918c;
        Object mo5076e = c3339f.mo5076e("androidx.savedstate.SavedStateRegistry");
        if (mo5076e instanceof Bundle) {
            bundle = (Bundle) mo5076e;
        } else {
            bundle = null;
        }
        c3781e.m5785j(bundle);
        c3339f.mo5077f("androidx.savedstate.SavedStateRegistry", new C0226c0(16, this));
    }

    @Override // p172w3.InterfaceC3782f
    /* renamed from: b */
    public final C3781e mo520b() {
        return this.f16404h;
    }

    @Override // p153u0.InterfaceC3338e
    /* renamed from: c */
    public final boolean mo5074c(Object obj) {
        return this.f16401e.mo5074c(obj);
    }

    @Override // p153u0.InterfaceC3338e
    /* renamed from: d */
    public final Map mo5075d() {
        return this.f16401e.mo5075d();
    }

    @Override // p153u0.InterfaceC3338e
    /* renamed from: e */
    public final Object mo5076e(String str) {
        return this.f16401e.mo5076e(str);
    }

    @Override // p153u0.InterfaceC3338e
    /* renamed from: f */
    public final InterfaceC3337d mo5077f(String str, InterfaceC3277a interfaceC3277a) {
        return this.f16401e.mo5077f(str, interfaceC3277a);
    }

    @Override // androidx.lifecycle.InterfaceC0213t
    /* renamed from: g */
    public final C0216v mo415g() {
        return this.f16403g;
    }
}
