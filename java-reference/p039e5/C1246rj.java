package p039e5;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import p032d6.InterfaceC0516a0;
import p053g5.C1690i;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.rj */
/* loaded from: classes.dex */
public final class C1246rj extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public InterfaceC2425y0 f7365i;

    /* renamed from: j */
    public C2349d1 f7366j;

    /* renamed from: k */
    public boolean f7367k;

    /* renamed from: l */
    public int f7368l;

    /* renamed from: m */
    public /* synthetic */ Object f7369m;

    /* renamed from: n */
    public final /* synthetic */ Context f7370n;

    /* renamed from: o */
    public final /* synthetic */ boolean f7371o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC2425y0 f7372p;

    /* renamed from: q */
    public final /* synthetic */ C2349d1 f7373q;

    /* renamed from: r */
    public final /* synthetic */ InterfaceC2425y0 f7374r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1246rj(Context context, boolean z7, InterfaceC2425y0 interfaceC2425y0, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y02, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f7370n = context;
        this.f7371o = z7;
        this.f7372p = interfaceC2425y0;
        this.f7373q = c2349d1;
        this.f7374r = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1246rj) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C1246rj c1246rj = new C1246rj(this.f7370n, this.f7371o, this.f7372p, this.f7373q, this.f7374r, interfaceC2313c);
        c1246rj.f7369m = obj;
        return c1246rj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:35|(1:(9:38|39|40|18|19|20|(3:22|(1:24)|25)|26|27)(2:41|42))(2:43|44))(4:3|4|5|(2:7|8)(1:10))|11|12|13|14|15|(7:17|18|19|20|(0)|26|27)|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        Throwable th;
        C1246rj c1246rj;
        boolean z7;
        C2349d1 c2349d1;
        InterfaceC2425y0 interfaceC2425y0;
        Context context;
        Context context2;
        Object m2985m;
        Throwable m2747a;
        int i7 = this.f7368l;
        C1694m c1694m = C1694m.f10482a;
        Context context3 = this.f7370n;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (i7 != 0) {
            try {
            } catch (Throwable th2) {
                th = th2;
                c1246rj = this;
                m2985m = AbstractC1793a0.m2985m(th);
                m2747a = C1690i.m2747a(m2985m);
                if (m2747a != null) {
                }
                float f7 = AbstractC1092mk.f5952h;
                c1246rj.f7374r.setValue(Boolean.FALSE);
                return c1694m;
            }
            if (i7 != 1) {
                if (i7 == 2) {
                    context2 = (Context) this.f7369m;
                    AbstractC1793a0.m2972L(obj);
                    c1246rj = this;
                    C1238rb c1238rb = C1238rb.f7307a;
                    C1238rb.m2167h(context2, (Uri) obj);
                    m2985m = c1694m;
                    m2747a = C1690i.m2747a(m2985m);
                    if (m2747a != null) {
                        String message = m2747a.getMessage();
                        if (message == null) {
                            message = "下载更新失败";
                        }
                        Toast.makeText(context3, message, 0).show();
                    }
                    float f72 = AbstractC1092mk.f5952h;
                    c1246rj.f7374r.setValue(Boolean.FALSE);
                    return c1694m;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z7 = this.f7367k;
            c2349d1 = this.f7366j;
            interfaceC2425y0 = this.f7365i;
            context = (Context) this.f7369m;
            AbstractC1793a0.m2972L(obj);
        } else {
            AbstractC1793a0.m2972L(obj);
            z7 = this.f7371o;
            interfaceC2425y0 = this.f7372p;
            C2349d1 c2349d12 = this.f7373q;
            try {
                C1238rb c1238rb2 = C1238rb.f7307a;
                this.f7369m = context3;
                this.f7365i = interfaceC2425y0;
                this.f7366j = c2349d12;
                this.f7367k = z7;
                this.f7368l = 1;
                Object m2179p = c1238rb2.m2179p(this);
                if (m2179p != enumC2465a) {
                    c2349d1 = c2349d12;
                    obj = m2179p;
                    context = context3;
                } else {
                    return enumC2465a;
                }
            } catch (Throwable th3) {
                th = th3;
                c1246rj = this;
                th = th;
                m2985m = AbstractC1793a0.m2985m(th);
                m2747a = C1690i.m2747a(m2985m);
                if (m2747a != null) {
                }
                float f722 = AbstractC1092mk.f5952h;
                c1246rj.f7374r.setValue(Boolean.FALSE);
                return c1694m;
            }
        }
        boolean z8 = z7;
        C1227r0 c1227r0 = (C1227r0) obj;
        float f8 = AbstractC1092mk.f5952h;
        interfaceC2425y0.setValue(c1227r0);
        C1238rb c1238rb3 = C1238rb.f7307a;
        C1215qj c1215qj = new C1215qj(c2349d1, 0);
        this.f7369m = context;
        this.f7365i = null;
        this.f7366j = null;
        this.f7368l = 2;
        c1246rj = this;
        obj = c1238rb3.m2178f(context, c1227r0, z8, c1215qj, c1246rj);
        if (obj != enumC2465a) {
            context2 = context;
            C1238rb c1238rb4 = C1238rb.f7307a;
            C1238rb.m2167h(context2, (Uri) obj);
            m2985m = c1694m;
            m2747a = C1690i.m2747a(m2985m);
            if (m2747a != null) {
            }
            float f7222 = AbstractC1092mk.f5952h;
            c1246rj.f7374r.setValue(Boolean.FALSE);
            return c1694m;
        }
        return enumC2465a;
    }
}
