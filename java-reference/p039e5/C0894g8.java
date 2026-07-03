package p039e5;

import android.content.Context;
import android.net.Network;
import java.util.Iterator;
import java.util.List;
import p032d6.AbstractC0525d0;
import p053g5.C1694m;
import p054g6.C1701c0;
import p085l0.InterfaceC2425y0;
import p116p0.AbstractC2834c;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3365h;
import p158u5.AbstractC3366i;
import p158u5.AbstractC3367j;
import p161v0.AbstractC3470q;
import p161v0.C3469p;
import p190z.C3860d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.g8 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0894g8 extends AbstractC3365h implements InterfaceC3277a {

    /* renamed from: m */
    public final /* synthetic */ Context f4198m;

    /* renamed from: n */
    public final /* synthetic */ List f4199n;

    /* renamed from: o */
    public final /* synthetic */ C1451y7 f4200o;

    /* renamed from: p */
    public final /* synthetic */ C3469p f4201p;

    /* renamed from: q */
    public final /* synthetic */ C3469p f4202q;

    /* renamed from: r */
    public final /* synthetic */ InterfaceC2425y0 f4203r;

    /* renamed from: s */
    public final /* synthetic */ String f4204s;

    /* renamed from: t */
    public final /* synthetic */ InterfaceC2425y0 f4205t;

    /* renamed from: u */
    public final /* synthetic */ InterfaceC2425y0 f4206u;

    /* renamed from: v */
    public final /* synthetic */ InterfaceC2425y0 f4207v;

    /* renamed from: w */
    public final /* synthetic */ InterfaceC2425y0 f4208w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0894g8(Context context, List list, C1451y7 c1451y7, C3469p c3469p, C3469p c3469p2, InterfaceC2425y0 interfaceC2425y0, String str, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05) {
        super(0, AbstractC3366i.class, "startLookup", "DnsLookupPanel$startLookup(Landroid/content/Context;Ljava/util/List;Lcom/paoman/lema/DnsLookupEngine;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.f4198m = context;
        this.f4199n = list;
        this.f4200o = c1451y7;
        this.f4201p = c3469p;
        this.f4202q = c3469p2;
        this.f4203r = interfaceC2425y0;
        this.f4204s = str;
        this.f4205t = interfaceC2425y02;
        this.f4206u = interfaceC2425y03;
        this.f4207v = interfaceC2425y04;
        this.f4208w = interfaceC2425y05;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        Object obj;
        Network network;
        C3860d c3860d = AbstractC1328u8.f7898a;
        InterfaceC2425y0 interfaceC2425y0 = this.f4203r;
        String str = (String) interfaceC2425y0.getValue();
        Context context = this.f4198m;
        AbstractC3367j.m5100e(context, "context");
        AbstractC3367j.m5100e(str, "query");
        context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_dns_query", str).apply();
        Iterator it = this.f4199n.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3367j.m5096a(((C1248rl) obj).f7390a, this.f4204s)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C1248rl c1248rl = (C1248rl) obj;
        if (c1248rl != null) {
            network = c1248rl.f7392c;
        } else {
            network = null;
        }
        Context applicationContext = context.getApplicationContext();
        AbstractC3367j.m5099d(applicationContext, "getApplicationContext(...)");
        String str2 = (String) interfaceC2425y0.getValue();
        boolean booleanValue = ((Boolean) this.f4205t.getValue()).booleanValue();
        boolean booleanValue2 = ((Boolean) this.f4206u.getValue()).booleanValue();
        boolean booleanValue3 = ((Boolean) this.f4207v.getValue()).booleanValue();
        C3469p c3469p = this.f4201p;
        c3469p.getClass();
        AbstractC2834c abstractC2834c = AbstractC3470q.m5264e(c3469p).f16763c;
        boolean booleanValue4 = ((Boolean) this.f4208w.getValue()).booleanValue();
        C3469p c3469p2 = this.f4202q;
        c3469p2.getClass();
        AbstractC2834c abstractC2834c2 = AbstractC3470q.m5264e(c3469p2).f16763c;
        C1451y7 c1451y7 = this.f4200o;
        C1701c0 c1701c0 = c1451y7.f9299e;
        AbstractC3367j.m5100e(str2, "query");
        AbstractC3367j.m5100e(abstractC2834c, "pageServers");
        AbstractC3367j.m5100e(abstractC2834c2, "pageEcsSubnets");
        c1451y7.m2426d();
        String m2015c = AbstractC1155ol.m2015c(str2);
        if (!AbstractC1155ol.m2014b(m2015c)) {
            C0703a8 c0703a8 = new C0703a8(null, "请输入有效域名或 IP", null, null, null, 2043);
            c1701c0.getClass();
            c1701c0.m2752j(null, c0703a8);
        } else {
            c1451y7.f9296b.set(true);
            C0703a8 c0703a82 = new C0703a8(m2015c, "查询中…", null, null, null, 376);
            c1701c0.getClass();
            c1701c0.m2752j(null, c0703a82);
            c1451y7.f9297c = AbstractC0525d0.m1141s(c1451y7.f9295a, null, new C1420x7(m2015c, c1451y7, applicationContext, booleanValue, booleanValue2, booleanValue3, abstractC2834c, booleanValue4, abstractC2834c2, network, null), 3);
        }
        return C1694m.f10482a;
    }
}
