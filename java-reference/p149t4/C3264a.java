package p149t4;

import p022c4.C0400j;
import p067i4.C2068a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t4.a */
/* loaded from: classes.dex */
public final class C3264a extends AbstractC3268e {

    /* renamed from: c */
    public final /* synthetic */ int f16111c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3264a(C2068a c2068a, int i7) {
        super(c2068a);
        this.f16111c = i7;
    }

    @Override // p149t4.AbstractC3269f
    /* renamed from: d */
    public final String mo4976d() {
        if (((C2068a) this.f16115a).f12257f == 60) {
            StringBuilder sb = new StringBuilder();
            m4979f(sb, 5);
            m4981j(sb, 45, 15);
            return sb.toString();
        }
        throw C0400j.m878a();
    }

    @Override // p149t4.AbstractC3268e
    /* renamed from: h */
    public final void mo4977h(StringBuilder sb, int i7) {
        switch (this.f16111c) {
            case 0:
                sb.append("(3103)");
                return;
            default:
                if (i7 < 10000) {
                    sb.append("(3202)");
                    return;
                } else {
                    sb.append("(3203)");
                    return;
                }
        }
    }

    @Override // p149t4.AbstractC3268e
    /* renamed from: i */
    public final int mo4978i(int i7) {
        switch (this.f16111c) {
            case 0:
                return i7;
            default:
                if (i7 >= 10000) {
                    return i7 - 10000;
                }
                return i7;
        }
    }
}
