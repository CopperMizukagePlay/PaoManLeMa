package p099m6;

import p006a7.C0137t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.b0 */
/* loaded from: classes.dex */
public final class C2594b0 extends AbstractC2595c {

    /* renamed from: a */
    public final /* synthetic */ C2621v f14026a;

    /* renamed from: b */
    public final /* synthetic */ int f14027b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f14028c;

    public C2594b0(C2621v c2621v, int i7, byte[] bArr) {
        this.f14026a = c2621v;
        this.f14027b = i7;
        this.f14028c = bArr;
    }

    @Override // p099m6.AbstractC2595c
    /* renamed from: c */
    public final long mo2158c() {
        return this.f14027b;
    }

    @Override // p099m6.AbstractC2595c
    /* renamed from: d */
    public final C2621v mo2159d() {
        return this.f14026a;
    }

    @Override // p099m6.AbstractC2595c
    /* renamed from: p */
    public final void mo2160p(C0137t c0137t) {
        if (!c0137t.f551g) {
            c0137t.f550f.m267t(this.f14027b, this.f14028c);
            c0137t.m300b();
            return;
        }
        throw new IllegalStateException("closed");
    }
}
