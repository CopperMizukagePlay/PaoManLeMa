package p039e5;

import android.net.Network;
import java.util.List;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p091l6.C2477h;
import p091l6.C2478i;
import p091l6.InterfaceC2474e;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.k2 */
/* loaded from: classes.dex */
public final class C1012k2 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: A */
    public final /* synthetic */ int f5189A;

    /* renamed from: B */
    public final /* synthetic */ int f5190B;

    /* renamed from: i */
    public InterfaceC2474e f5191i;

    /* renamed from: j */
    public Object f5192j;

    /* renamed from: k */
    public String f5193k;

    /* renamed from: l */
    public Object f5194l;

    /* renamed from: m */
    public Object f5195m;

    /* renamed from: n */
    public EnumC1127no f5196n;

    /* renamed from: o */
    public Network f5197o;

    /* renamed from: p */
    public int f5198p;

    /* renamed from: q */
    public int f5199q;

    /* renamed from: r */
    public int f5200r;

    /* renamed from: s */
    public int f5201s;

    /* renamed from: t */
    public final /* synthetic */ InterfaceC3281e f5202t;

    /* renamed from: u */
    public final /* synthetic */ String f5203u;

    /* renamed from: v */
    public final /* synthetic */ int f5204v;

    /* renamed from: w */
    public final /* synthetic */ List f5205w;

    /* renamed from: x */
    public final /* synthetic */ String f5206x;

    /* renamed from: y */
    public final /* synthetic */ EnumC1127no f5207y;

    /* renamed from: z */
    public final /* synthetic */ Network f5208z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1012k2(InterfaceC3281e interfaceC3281e, String str, int i7, List list, String str2, EnumC1127no enumC1127no, Network network, int i8, int i9, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f5202t = interfaceC3281e;
        this.f5203u = str;
        this.f5204v = i7;
        this.f5205w = list;
        this.f5206x = str2;
        this.f5207y = enumC1127no;
        this.f5208z = network;
        this.f5189A = i8;
        this.f5190B = i9;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1012k2) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C1012k2(this.f5202t, this.f5203u, this.f5204v, this.f5205w, this.f5206x, this.f5207y, this.f5208z, this.f5189A, this.f5190B, interfaceC2313c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x011b, code lost:
    
        if (r2 == r6) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6, types: [l6.e] */
    /* JADX WARN: Type inference failed for: r15v8, types: [l6.e] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [l6.e] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        InterfaceC3281e interfaceC3281e;
        String str;
        List list;
        String str2;
        C2478i c2478i;
        int i7;
        EnumC1127no enumC1127no;
        int i8;
        Network network;
        int i9;
        String str3;
        String str4;
        int i10;
        EnumC1127no enumC1127no2;
        ?? r10;
        int i11;
        EnumC1127no enumC1127no3;
        C2478i c2478i2;
        String str5;
        Object m1130h;
        ?? r22;
        Throwable th;
        int i12 = this.f5201s;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        str5 = (String) this.f5192j;
                        r22 = this.f5191i;
                        try {
                            AbstractC1793a0.m2972L(obj);
                            c2478i = r22;
                            m1130h = obj;
                            C1296t7 c1296t7 = new C1296t7(str5, null, (List) m1130h);
                            c2478i.m4033c();
                            return c1296t7;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    i7 = this.f5199q;
                    i10 = this.f5198p;
                    network = (Network) this.f5195m;
                    enumC1127no2 = (EnumC1127no) this.f5194l;
                    str4 = this.f5193k;
                    str3 = (String) this.f5192j;
                    r10 = this.f5191i;
                    try {
                        AbstractC1793a0.m2972L(obj);
                        i11 = i10;
                        enumC1127no3 = enumC1127no2;
                        c2478i2 = r10;
                        String str6 = str3;
                        C0856f2 c0856f2 = new C0856f2(enumC1127no3, str4, str6, network, i11, i7, null, 1);
                        str5 = str6;
                        this.f5191i = c2478i2;
                        this.f5192j = str5;
                        this.f5193k = null;
                        this.f5194l = null;
                        this.f5195m = null;
                        this.f5196n = null;
                        this.f5197o = null;
                        this.f5201s = 3;
                        m1130h = AbstractC0525d0.m1130h(c0856f2, this);
                        c2478i = c2478i2;
                    } catch (Throwable th3) {
                        th = th3;
                        r22 = r10;
                    }
                }
                ((C2477h) r22).m4033c();
                throw th;
            }
            i7 = this.f5200r;
            i8 = this.f5199q;
            i9 = this.f5198p;
            Network network2 = this.f5197o;
            enumC1127no = this.f5196n;
            str2 = (String) this.f5195m;
            list = (List) this.f5194l;
            str = this.f5193k;
            interfaceC3281e = (InterfaceC3281e) this.f5192j;
            ?? r15 = this.f5191i;
            AbstractC1793a0.m2972L(obj);
            network = network2;
            c2478i = r15;
        } else {
            AbstractC1793a0.m2972L(obj);
            C2478i c2478i3 = C1074m2.f5787b;
            this.f5191i = c2478i3;
            interfaceC3281e = this.f5202t;
            this.f5192j = interfaceC3281e;
            str = this.f5203u;
            this.f5193k = str;
            list = this.f5205w;
            this.f5194l = list;
            str2 = this.f5206x;
            this.f5195m = str2;
            EnumC1127no enumC1127no4 = this.f5207y;
            this.f5196n = enumC1127no4;
            Network network3 = this.f5208z;
            this.f5197o = network3;
            int i13 = this.f5204v;
            this.f5198p = i13;
            int i14 = this.f5189A;
            this.f5199q = i14;
            int i15 = this.f5190B;
            this.f5200r = i15;
            this.f5201s = 1;
            if (c2478i3.m4031a(this) != enumC2465a) {
                c2478i = c2478i3;
                i7 = i15;
                enumC1127no = enumC1127no4;
                i8 = i14;
                network = network3;
                i9 = i13;
            }
            return enumC2465a;
        }
        String str7 = str2;
        String str8 = str;
        if (interfaceC3281e != null) {
            try {
                C0942ho c0942ho = new C0942ho(i9 + 1, list.size(), str8, str7, "回退无ECS");
                str3 = str8;
                str4 = str7;
                this.f5191i = c2478i;
                this.f5192j = str3;
                this.f5193k = str4;
                this.f5194l = enumC1127no;
                this.f5195m = network;
                this.f5196n = null;
                this.f5197o = null;
                this.f5198p = i8;
                this.f5199q = i7;
                this.f5201s = 2;
                if (interfaceC3281e.mo22d(c0942ho, this) != enumC2465a) {
                    i10 = i8;
                    enumC1127no2 = enumC1127no;
                    r10 = c2478i;
                    i11 = i10;
                    enumC1127no3 = enumC1127no2;
                    c2478i2 = r10;
                    String str62 = str3;
                    C0856f2 c0856f22 = new C0856f2(enumC1127no3, str4, str62, network, i11, i7, null, 1);
                    str5 = str62;
                    this.f5191i = c2478i2;
                    this.f5192j = str5;
                    this.f5193k = null;
                    this.f5194l = null;
                    this.f5195m = null;
                    this.f5196n = null;
                    this.f5197o = null;
                    this.f5201s = 3;
                    m1130h = AbstractC0525d0.m1130h(c0856f22, this);
                    c2478i = c2478i2;
                } else {
                    return enumC2465a;
                }
            } catch (Throwable th4) {
                th = th4;
                r22 = c2478i;
            }
        } else {
            str3 = str8;
            str4 = str7;
            i11 = i8;
            enumC1127no3 = enumC1127no;
            c2478i2 = c2478i;
            String str622 = str3;
            C0856f2 c0856f222 = new C0856f2(enumC1127no3, str4, str622, network, i11, i7, null, 1);
            str5 = str622;
            this.f5191i = c2478i2;
            this.f5192j = str5;
            this.f5193k = null;
            this.f5194l = null;
            this.f5195m = null;
            this.f5196n = null;
            this.f5197o = null;
            this.f5201s = 3;
            m1130h = AbstractC0525d0.m1130h(c0856f222, this);
            c2478i = c2478i2;
        }
    }
}
