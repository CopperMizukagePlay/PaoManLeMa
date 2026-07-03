package p039e5;

import android.content.Context;
import android.widget.Toast;
import java.util.concurrent.atomic.AtomicBoolean;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.pb */
/* loaded from: classes.dex */
public final class C1176pb extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f6851i;

    /* renamed from: j */
    public final /* synthetic */ Context f6852j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1176pb(Context context, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f6851i = i7;
        this.f6852j = context;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f6851i) {
            case 0:
                return ((C1176pb) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 1:
                C1176pb c1176pb = (C1176pb) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m = C1694m.f10482a;
                c1176pb.mo29m(c1694m);
                return c1694m;
            default:
                C1176pb c1176pb2 = (C1176pb) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m2 = C1694m.f10482a;
                c1176pb2.mo29m(c1694m2);
                return c1694m2;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f6851i) {
            case 0:
                return new C1176pb(this.f6852j, interfaceC2313c, 0);
            case 1:
                return new C1176pb(this.f6852j, interfaceC2313c, 1);
            default:
                return new C1176pb(this.f6852j, interfaceC2313c, 2);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f6851i;
        C1694m c1694m = C1694m.f10482a;
        Context context = this.f6852j;
        switch (i7) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                C1238rb c1238rb = C1238rb.f7307a;
                C1238rb.m2164d(context);
                C0961ib m2173n = C1238rb.m2173n(context);
                if (m2173n == null) {
                    return null;
                }
                String str = m2173n.f4800a;
                String str2 = m2173n.f4804e;
                if (!C1238rb.m2177s(C1238rb.m2163c(context, str2), new Long(m2173n.f4806g))) {
                    C1238rb.m2165e(context);
                    return null;
                }
                if (!C1238rb.m2170k(str)) {
                    C1238rb.m2165e(context);
                    return null;
                }
                return new C1227r0(str, m2173n.f4801b, m2173n.f4802c, m2173n.f4803d, str2, m2173n.f4805f);
            case 1:
                AbstractC1793a0.m2972L(obj);
                AbstractC1092mk.m1693K3(context).edit().remove("extreme_mode").apply();
                return c1694m;
            default:
                AbstractC1793a0.m2972L(obj);
                AtomicBoolean atomicBoolean = AbstractC0697a2.f2310a;
                if (context.getSharedPreferences("crash_log_prefs", 0).getBoolean("pending_crash", false)) {
                    context.getSharedPreferences("crash_log_prefs", 0).edit().putBoolean("pending_crash", false).apply();
                    Toast.makeText(context, "检测到上次运行崩溃，可在「设置 → 杂项」中查看崩溃日志", 1).show();
                }
                return c1694m;
        }
    }
}
