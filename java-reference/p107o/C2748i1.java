package p107o;

import android.widget.Magnifier;
import p027d1.C0464b;
import p067i4.AbstractC2072e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.i1 */
/* loaded from: classes.dex */
public class C2748i1 implements InterfaceC2742g1 {

    /* renamed from: a */
    public final Magnifier f14676a;

    public C2748i1(Magnifier magnifier) {
        this.f14676a = magnifier;
    }

    @Override // p107o.InterfaceC2742g1
    /* renamed from: a */
    public void mo4411a(long j6, long j7) {
        this.f14676a.show(C0464b.m1008d(j6), C0464b.m1009e(j6));
    }

    /* renamed from: b */
    public final void m4418b() {
        this.f14676a.dismiss();
    }

    /* renamed from: c */
    public final long m4419c() {
        return AbstractC2072e.m3326b(this.f14676a.getWidth(), this.f14676a.getHeight());
    }

    /* renamed from: d */
    public final void m4420d() {
        this.f14676a.update();
    }
}
