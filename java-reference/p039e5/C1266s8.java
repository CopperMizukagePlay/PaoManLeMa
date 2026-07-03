package p039e5;

import android.content.Context;
import java.util.List;
import p024c6.AbstractC0444k;
import p053g5.C1694m;
import p085l0.C2395p;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3283g;
import p152u.C3315c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.s8 */
/* loaded from: classes.dex */
public final class C1266s8 extends AbstractC3368k implements InterfaceC3283g {

    /* renamed from: f */
    public final /* synthetic */ List f7528f;

    /* renamed from: g */
    public final /* synthetic */ Context f7529g;

    /* renamed from: h */
    public final /* synthetic */ C0703a8 f7530h;

    /* renamed from: i */
    public final /* synthetic */ boolean f7531i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3279c f7532j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC3279c f7533k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266s8(List list, Context context, C0703a8 c0703a8, boolean z7, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2) {
        super(4);
        this.f7528f = list;
        this.f7529g = context;
        this.f7530h = c0703a8;
        this.f7531i = z7;
        this.f7532j = interfaceC3279c;
        this.f7533k = interfaceC3279c2;
    }

    @Override // p150t5.InterfaceC3283g
    /* renamed from: i */
    public final Object mo1493i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        int i8;
        int i9;
        C3315c c3315c = (C3315c) obj;
        int intValue = ((Number) obj2).intValue();
        C2395p c2395p = (C2395p) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (c2395p.m3870g(c3315c)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i7 = i9 | intValue2;
        } else {
            i7 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (c2395p.m3866e(intValue)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i7 |= i8;
        }
        if ((i7 & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C1482z7 c1482z7 = (C1482z7) this.f7528f.get(intValue);
            c2395p.m3857Z(1966504437);
            StringBuilder sb = new StringBuilder();
            String str = c1482z7.f9831a;
            String str2 = c1482z7.f9832b;
            sb.append(str);
            if (!AbstractC0444k.m937a0(str2)) {
                sb.append(" · ".concat(str2));
            }
            AbstractC1328u8.m2361f(sb.toString(), AbstractC3178i.m4873d(986132897, new C1173p8(c1482z7, this.f7529g, this.f7530h, this.f7531i, this.f7532j, this.f7533k), c2395p), c2395p, 48);
            c2395p.m3888r(false);
        }
        return C1694m.f10482a;
    }
}
