package p039e5;

import p053g5.C1694m;
import p085l0.C2395p;
import p092m.C2493i;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.fq */
/* loaded from: classes.dex */
public final class C0880fq implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f4057e;

    /* renamed from: f */
    public final /* synthetic */ String f4058f;

    /* renamed from: g */
    public final /* synthetic */ String f4059g;

    /* renamed from: h */
    public final /* synthetic */ String f4060h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3279c f4061i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3279c f4062j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC3279c f4063k;

    /* renamed from: l */
    public final /* synthetic */ boolean f4064l;

    /* renamed from: m */
    public final /* synthetic */ boolean f4065m;

    /* renamed from: n */
    public final /* synthetic */ boolean f4066n;

    public /* synthetic */ C0880fq(String str, String str2, String str3, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2, InterfaceC3279c interfaceC3279c3, boolean z7, boolean z8, boolean z9, int i7) {
        this.f4057e = i7;
        this.f4058f = str;
        this.f4059g = str2;
        this.f4060h = str3;
        this.f4061i = interfaceC3279c;
        this.f4062j = interfaceC3279c2;
        this.f4063k = interfaceC3279c3;
        this.f4064l = z7;
        this.f4065m = z8;
        this.f4066n = z9;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f4057e) {
            case 0:
                C2395p c2395p = (C2395p) obj2;
                ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C2493i) obj, "$this$AnimatedVisibility");
                boolean z13 = this.f4065m;
                boolean z14 = this.f4064l;
                if (z14 && !z13) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z14 && !z13) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z14 && !this.f4066n) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                AbstractC0945hr.m1569M(this.f4058f, this.f4059g, this.f4060h, this.f4061i, this.f4062j, this.f4063k, z7, z8, z9, null, null, null, c2395p, 0, 0, 3584);
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj2;
                ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C2493i) obj, "$this$AnimatedVisibility");
                boolean z15 = this.f4065m;
                boolean z16 = this.f4064l;
                if (z16 && !z15) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z16 && !z15) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z16 && !this.f4066n) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                AbstractC0945hr.m1569M(this.f4058f, this.f4059g, this.f4060h, this.f4061i, this.f4062j, this.f4063k, z10, z11, z12, "下载 Mbps", "上传 Mbps", "总速 Mbps", c2395p2, 805306368, 54, 0);
                return C1694m.f10482a;
        }
    }
}
