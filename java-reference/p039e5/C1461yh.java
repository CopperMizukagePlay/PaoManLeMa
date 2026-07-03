package p039e5;

import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.yh */
/* loaded from: classes.dex */
public final class C1461yh implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f9413e;

    /* renamed from: f */
    public final /* synthetic */ EnumC1311tm f9414f;

    public /* synthetic */ C1461yh(EnumC1311tm enumC1311tm, int i7) {
        this.f9413e = i7;
        this.f9414f = enumC1311tm;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        String str;
        String str2;
        int i7 = this.f9413e;
        C1694m c1694m = C1694m.f10482a;
        EnumC1311tm enumC1311tm = EnumC1311tm.f7830e;
        EnumC1311tm enumC1311tm2 = this.f9414f;
        switch (i7) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    float f7 = AbstractC1092mk.f5952h;
                    if (enumC1311tm2 == enumC1311tm) {
                        str = "下载";
                    } else {
                        str = "上传";
                    }
                    AbstractC1850a7.m3108b(str.concat("地址"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p, 0, 0, 131070);
                }
                return c1694m;
            default:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    if (enumC1311tm2 == enumC1311tm) {
                        str2 = "流式文件可加 fetch+ 前缀，例如 fetch+https://example.com/stream";
                    } else {
                        str2 = "这里单独编辑当前这条 URL";
                    }
                    AbstractC1850a7.m3108b(str2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p2, 0, 0, 131070);
                }
                return c1694m;
        }
    }
}
