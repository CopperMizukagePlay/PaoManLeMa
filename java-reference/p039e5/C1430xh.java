package p039e5;

import p001a0.AbstractC0094y0;
import p024c6.AbstractC0451r;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.xh */
/* loaded from: classes.dex */
public final class C1430xh implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f8751e = 1;

    /* renamed from: f */
    public final /* synthetic */ boolean f8752f;

    /* renamed from: g */
    public final /* synthetic */ Object f8753g;

    public C1430xh(String str, boolean z7) {
        this.f8753g = str;
        this.f8752f = z7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        String str;
        int i7;
        switch (this.f8751e) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                int intValue = ((Number) obj2).intValue();
                EnumC1311tm enumC1311tm = (EnumC1311tm) this.f8753g;
                if ((intValue & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    boolean z7 = this.f8752f;
                    String str2 = "上传";
                    EnumC1311tm enumC1311tm2 = EnumC1311tm.f7830e;
                    if (z7) {
                        if (enumC1311tm == enumC1311tm2) {
                            str2 = "下载";
                        }
                        str = "修改 ";
                    } else {
                        if (enumC1311tm == enumC1311tm2) {
                            str2 = "下载";
                        }
                        str = "新增 ";
                    }
                    AbstractC1850a7.m3108b(AbstractC0094y0.m185l(str, str2, " URL"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p, 0, 0, 131070);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    Integer m973O = AbstractC0451r.m973O((String) this.f8753g);
                    if (m973O != null) {
                        i7 = m973O.intValue();
                    } else {
                        i7 = 2000;
                    }
                    if (this.f8752f && i7 < 1500) {
                        c2395p2.m3857Z(-1083500641);
                        AbstractC1850a7.m3108b("开启 ECS 时地域查询至少 1500 ms，当前 " + i7 + " ms 可能导致只显示「默认」", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p2, 0, 0, 131070);
                        c2395p2.m3888r(false);
                    } else {
                        c2395p2.m3857Z(-1083259926);
                        AbstractC1850a7.m3108b("300~10000", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p2, 0, 0, 131070);
                        c2395p2.m3888r(false);
                    }
                }
                return C1694m.f10482a;
        }
    }

    public C1430xh(boolean z7, EnumC1311tm enumC1311tm) {
        this.f8752f = z7;
        this.f8753g = enumC1311tm;
    }
}
