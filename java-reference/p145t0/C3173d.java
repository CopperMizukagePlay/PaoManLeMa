package p145t0;

import java.util.ArrayList;
import p039e5.C0974ip;
import p039e5.C1137o3;
import p085l0.C2395p;
import p085l0.C2405r1;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p150t5.InterfaceC3283g;
import p158u5.AbstractC3358a;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3382y;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t0.d */
/* loaded from: classes.dex */
public final class C3173d implements InterfaceC3171b {

    /* renamed from: e */
    public final int f15882e;

    /* renamed from: f */
    public final boolean f15883f;

    /* renamed from: g */
    public Object f15884g;

    /* renamed from: h */
    public C2405r1 f15885h;

    /* renamed from: i */
    public ArrayList f15886i;

    public C3173d(int i7, Object obj, boolean z7) {
        this.f15882e = i7;
        this.f15883f = z7;
        this.f15884g = obj;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo24c(Object obj, Object obj2, Object obj3) {
        return m4866h(obj, (C2395p) obj2, ((Number) obj3).intValue());
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo22d(Object obj, Object obj2) {
        return m4864e(((Number) obj2).intValue(), (C2395p) obj);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [u5.a, t5.e] */
    /* renamed from: e */
    public final Object m4864e(int i7, C2395p c2395p) {
        int m4870a;
        c2395p.m3859a0(this.f15882e);
        m4867j(c2395p);
        if (c2395p.m3870g(this)) {
            m4870a = AbstractC3178i.m4870a(2, 0);
        } else {
            m4870a = AbstractC3178i.m4870a(1, 0);
        }
        int i8 = i7 | m4870a;
        Object obj = this.f15884g;
        AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC3382y.m5111b(2, obj);
        Object mo22d = ((InterfaceC3281e) obj).mo22d(c2395p, Integer.valueOf(i8));
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new AbstractC3358a(2, C3173d.class, this, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;");
        }
        return mo22d;
    }

    /* renamed from: g */
    public final Object m4865g(Object obj, Object obj2, C2395p c2395p, int i7) {
        int m4870a;
        c2395p.m3859a0(this.f15882e);
        m4867j(c2395p);
        if (c2395p.m3870g(this)) {
            m4870a = AbstractC3178i.m4870a(2, 2);
        } else {
            m4870a = AbstractC3178i.m4870a(1, 2);
        }
        Object obj3 = this.f15884g;
        AbstractC3367j.m5098c(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC3382y.m5111b(4, obj3);
        Object mo1493i = ((InterfaceC3283g) obj3).mo1493i(obj, obj2, c2395p, Integer.valueOf(m4870a | i7));
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0974ip(this, obj, obj2, i7, 2);
        }
        return mo1493i;
    }

    /* renamed from: h */
    public final Object m4866h(Object obj, C2395p c2395p, int i7) {
        int m4870a;
        c2395p.m3859a0(this.f15882e);
        m4867j(c2395p);
        if (c2395p.m3870g(this)) {
            m4870a = AbstractC3178i.m4870a(2, 1);
        } else {
            m4870a = AbstractC3178i.m4870a(1, 1);
        }
        Object obj2 = this.f15884g;
        AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC3382y.m5111b(3, obj2);
        Object mo24c = ((InterfaceC3282f) obj2).mo24c(obj, c2395p, Integer.valueOf(m4870a | i7));
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1137o3(i7, 5, this, obj);
        }
        return mo24c;
    }

    @Override // p150t5.InterfaceC3283g
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ Object mo1493i(Object obj, Object obj2, Object obj3, Object obj4) {
        return m4865g(obj, obj2, (C2395p) obj3, ((Number) obj4).intValue());
    }

    /* renamed from: j */
    public final void m4867j(C2395p c2395p) {
        C2405r1 m3833A;
        if (this.f15883f && (m3833A = c2395p.m3833A()) != null) {
            c2395p.getClass();
            m3833A.f13540b |= 1;
            if (AbstractC3178i.m4874e(this.f15885h, m3833A)) {
                this.f15885h = m3833A;
                return;
            }
            ArrayList arrayList = this.f15886i;
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList();
                this.f15886i = arrayList2;
                arrayList2.add(m3833A);
                return;
            }
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (AbstractC3178i.m4874e((C2405r1) arrayList.get(i7), m3833A)) {
                    arrayList.set(i7, m3833A);
                    return;
                }
            }
            arrayList.add(m3833A);
        }
    }
}
