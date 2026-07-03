package p032d6;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.n0 */
/* loaded from: classes.dex */
public final class C0555n0 implements InterfaceC0585x0 {

    /* renamed from: e */
    public final boolean f1904e;

    public C0555n0(boolean z7) {
        this.f1904e = z7;
    }

    @Override // p032d6.InterfaceC0585x0
    /* renamed from: b */
    public final boolean mo1156b() {
        return this.f1904e;
    }

    @Override // p032d6.InterfaceC0585x0
    /* renamed from: d */
    public final C0547k1 mo1157d() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.f1904e) {
            str = "Active";
        } else {
            str = "New";
        }
        return AbstractC0094y0.m187n(sb, str, '}');
    }
}
