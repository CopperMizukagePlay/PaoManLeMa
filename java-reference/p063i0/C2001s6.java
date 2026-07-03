package p063i0;

import java.util.ArrayList;
import java.util.List;
import p053g5.C1694m;
import p140s2.AbstractC3092b;
import p140s2.AbstractC3099i;
import p140s2.C3091a;
import p145t0.C3173d;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3203g1;
import p146t1.InterfaceC3214k0;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;
import p158u5.C3377t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.s6 */
/* loaded from: classes.dex */
public final class C2001s6 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ ArrayList f11766f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3203g1 f11767g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3281e f11768h;

    /* renamed from: i */
    public final /* synthetic */ C3377t f11769i;

    /* renamed from: j */
    public final /* synthetic */ long f11770j;

    /* renamed from: k */
    public final /* synthetic */ int f11771k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC3282f f11772l;

    /* renamed from: m */
    public final /* synthetic */ ArrayList f11773m;

    /* renamed from: n */
    public final /* synthetic */ int f11774n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2001s6(ArrayList arrayList, InterfaceC3203g1 interfaceC3203g1, InterfaceC3281e interfaceC3281e, C3377t c3377t, long j6, int i7, InterfaceC3282f interfaceC3282f, ArrayList arrayList2, int i8) {
        super(1);
        this.f11766f = arrayList;
        this.f11767g = interfaceC3203g1;
        this.f11768h = interfaceC3281e;
        this.f11769i = c3377t;
        this.f11770j = j6;
        this.f11771k = i7;
        this.f11772l = interfaceC3282f;
        this.f11773m = arrayList2;
        this.f11774n = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7;
        boolean z7;
        boolean z8;
        AbstractC3237u0 abstractC3237u0 = (AbstractC3237u0) obj;
        ArrayList arrayList = this.f11766f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC3237u0.m4951j(abstractC3237u0, (AbstractC3239v0) arrayList.get(i8), this.f11769i.f16449e * i8, 0);
        }
        EnumC2025v6 enumC2025v6 = EnumC2025v6.f11986f;
        InterfaceC3281e interfaceC3281e = this.f11768h;
        InterfaceC3203g1 interfaceC3203g1 = this.f11767g;
        List mo4888g0 = interfaceC3203g1.mo4888g0(enumC2025v6, interfaceC3281e);
        int size2 = mo4888g0.size();
        int i9 = 0;
        while (true) {
            i7 = this.f11771k;
            if (i9 >= size2) {
                break;
            }
            AbstractC3239v0 mo4918e = ((InterfaceC3214k0) mo4888g0.get(i9)).mo4918e(C3091a.m4753a(this.f11770j, 0, 0, 0, 0, 11));
            AbstractC3237u0.m4951j(abstractC3237u0, mo4918e, 0, i7 - mo4918e.f16054f);
            i9++;
        }
        List mo4888g02 = interfaceC3203g1.mo4888g0(EnumC2025v6.f11987g, new C3173d(1621992604, new C1961n6(this.f11772l, this.f11773m, 1), true));
        int size3 = mo4888g02.size();
        for (int i10 = 0; i10 < size3; i10++) {
            InterfaceC3214k0 interfaceC3214k0 = (InterfaceC3214k0) mo4888g02.get(i10);
            int i11 = this.f11774n;
            if (i11 >= 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (i7 >= 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!(z7 & z8)) {
                AbstractC3099i.m4781a("width and height must be >= 0");
            }
            AbstractC3237u0.m4951j(abstractC3237u0, interfaceC3214k0.mo4918e(AbstractC3092b.m4771h(i11, i11, i7, i7)), 0, 0);
        }
        return C1694m.f10482a;
    }
}
