package p160v;

import java.util.Comparator;
import p031d5.C0512l;
import p066i3.AbstractC2067b;
import p152u.C3326n;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.c0 */
/* loaded from: classes.dex */
public final class C3403c0 implements Comparator {

    /* renamed from: e */
    public final /* synthetic */ int f16529e;

    /* renamed from: f */
    public final /* synthetic */ C0512l f16530f;

    public /* synthetic */ C3403c0(C0512l c0512l, int i7) {
        this.f16529e = i7;
        this.f16530f = c0512l;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f16529e) {
            case 0:
                Object obj3 = ((C3326n) obj).f16337i;
                C0512l c0512l = this.f16530f;
                return AbstractC2067b.m3284i(Integer.valueOf(c0512l.mo1098b(obj3)), Integer.valueOf(c0512l.mo1098b(((C3326n) obj2).f16337i)));
            default:
                Object obj4 = ((C3326n) obj2).f16337i;
                C0512l c0512l2 = this.f16530f;
                return AbstractC2067b.m3284i(Integer.valueOf(c0512l2.mo1098b(obj4)), Integer.valueOf(c0512l2.mo1098b(((C3326n) obj).f16337i)));
        }
    }
}
