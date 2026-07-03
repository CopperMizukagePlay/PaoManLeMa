package p039e5;

import android.net.Network;
import java.util.ArrayList;
import java.util.List;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1807o;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.l2 */
/* loaded from: classes.dex */
public final class C1043l2 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public int f5367i;

    /* renamed from: j */
    public /* synthetic */ Object f5368j;

    /* renamed from: k */
    public final /* synthetic */ List f5369k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC3281e f5370l;

    /* renamed from: m */
    public final /* synthetic */ String f5371m;

    /* renamed from: n */
    public final /* synthetic */ EnumC1127no f5372n;

    /* renamed from: o */
    public final /* synthetic */ Network f5373o;

    /* renamed from: p */
    public final /* synthetic */ int f5374p;

    /* renamed from: q */
    public final /* synthetic */ int f5375q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1043l2(List list, InterfaceC3281e interfaceC3281e, String str, EnumC1127no enumC1127no, Network network, int i7, int i8, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f5369k = list;
        this.f5370l = interfaceC3281e;
        this.f5371m = str;
        this.f5372n = enumC1127no;
        this.f5373o = network;
        this.f5374p = i7;
        this.f5375q = i8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1043l2) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C1043l2 c1043l2 = new C1043l2(this.f5369k, this.f5370l, this.f5371m, this.f5372n, this.f5373o, this.f5374p, this.f5375q, interfaceC2313c);
        c1043l2.f5368j = obj;
        return c1043l2;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f5367i;
        int i8 = 1;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC1793a0.m2972L(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC1793a0.m2972L(obj);
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f5368j;
        List list = this.f5369k;
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
        int i9 = 0;
        for (Object obj2 : list) {
            int i10 = i9 + 1;
            if (i9 >= 0) {
                String str = (String) obj2;
                C2325e c2325e = AbstractC0549l0.f1898a;
                arrayList.add(AbstractC0525d0.m1125c(interfaceC0516a0, ExecutorC2324d.f13302g, new C1012k2(this.f5370l, str, i9, list, this.f5371m, this.f5372n, this.f5373o, this.f5374p, this.f5375q, null), 2));
                i9 = i10;
                i8 = 1;
            } else {
                AbstractC1806n.m3072T();
                throw null;
            }
        }
        this.f5367i = i8;
        Object m1126d = AbstractC0525d0.m1126d(arrayList, this);
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (m1126d == enumC2465a) {
            return enumC2465a;
        }
        return m1126d;
    }
}
