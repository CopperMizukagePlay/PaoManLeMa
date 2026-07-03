package p039e5;

import java.util.List;
import p046f5.AbstractC1540e;
import p046f5.AbstractC1544i;
import p053g5.C1694m;
import p053g5.InterfaceC1684c;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.x2 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1415x2 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f8582e;

    /* renamed from: f */
    public final /* synthetic */ boolean f8583f;

    /* renamed from: g */
    public final /* synthetic */ Object f8584g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC1684c f8585h;

    public /* synthetic */ C1415x2(Object obj, InterfaceC3279c interfaceC3279c, boolean z7, int i7, int i8) {
        this.f8582e = i8;
        this.f8584g = obj;
        this.f8585h = interfaceC3279c;
        this.f8583f = z7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f8582e) {
            case 0:
                ((Integer) obj2).getClass();
                int m3957F = AbstractC2418w.m3957F(1);
                AbstractC1172p7.m2067n((List) this.f8584g, (InterfaceC3279c) this.f8585h, this.f8583f, (C2395p) obj, m3957F);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int m3957F2 = AbstractC2418w.m3957F(385);
                AbstractC1092mk.m1659E(this.f8583f, (InterfaceC3810r) this.f8584g, (C3173d) this.f8585h, (C2395p) obj, m3957F2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int m3957F3 = AbstractC2418w.m3957F(7);
                AbstractC1092mk.m1776d((String) this.f8584g, this.f8583f, (InterfaceC3277a) this.f8585h, (C2395p) obj, m3957F3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int m3957F4 = AbstractC2418w.m3957F(1);
                AbstractC0945hr.m1589o((EnumC1436xn) this.f8584g, (InterfaceC3279c) this.f8585h, this.f8583f, (C2395p) obj, m3957F4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int m3957F5 = AbstractC2418w.m3957F(1);
                AbstractC0945hr.m1568L((AbstractC1540e) this.f8584g, (InterfaceC3279c) this.f8585h, this.f8583f, (C2395p) obj, m3957F5);
                break;
            default:
                ((Integer) obj2).getClass();
                int m3957F6 = AbstractC2418w.m3957F(385);
                AbstractC1544i.m2475a(this.f8583f, (AbstractC1540e) this.f8584g, (C3173d) this.f8585h, (C2395p) obj, m3957F6);
                break;
        }
        return C1694m.f10482a;
    }

    public /* synthetic */ C1415x2(String str, boolean z7, InterfaceC3277a interfaceC3277a, int i7) {
        this.f8582e = 2;
        this.f8584g = str;
        this.f8583f = z7;
        this.f8585h = interfaceC3277a;
    }

    public /* synthetic */ C1415x2(boolean z7, Object obj, C3173d c3173d, int i7, int i8) {
        this.f8582e = i8;
        this.f8583f = z7;
        this.f8584g = obj;
        this.f8585h = c3173d;
    }
}
