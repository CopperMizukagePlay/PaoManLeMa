package p039e5;

import android.net.Uri;
import android.provider.DocumentsContract;
import java.util.ArrayList;
import p008b.C0242k0;
import p024c6.AbstractC0444k;
import p032d6.InterfaceC0516a0;
import p053g5.C1689h;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.s */
/* loaded from: classes.dex */
public final class C1257s extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f7450i = 1;

    /* renamed from: j */
    public /* synthetic */ Object f7451j;

    /* renamed from: k */
    public final /* synthetic */ boolean f7452k;

    /* renamed from: l */
    public int f7453l;

    /* renamed from: m */
    public final /* synthetic */ Object f7454m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1257s(C1196q0 c1196q0, boolean z7, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f7454m = c1196q0;
        this.f7452k = z7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f7450i) {
            case 0:
                return ((C1257s) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C1257s) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f7450i) {
            case 0:
                C1257s c1257s = new C1257s((C1196q0) this.f7454m, this.f7452k, interfaceC2313c);
                c1257s.f7451j = obj;
                return c1257s;
            default:
                C1257s c1257s2 = new C1257s((C0883ft) this.f7454m, this.f7452k, this.f7453l, interfaceC2313c);
                c1257s2.f7451j = obj;
                return c1257s2;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        String str;
        Object m2985m;
        boolean z7;
        switch (this.f7450i) {
            case 0:
                C1196q0 c1196q0 = (C1196q0) this.f7454m;
                int i7 = this.f7453l;
                C1694m c1694m = C1694m.f10482a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                Iterable iterable = (Iterable) c1196q0.f6971j.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    if (((C0800d9) obj2).f3351l == EnumC0768c9.f3010j) {
                        arrayList.add(obj2);
                    }
                }
                if (this.f7452k) {
                    int size = arrayList.size();
                    int i8 = 0;
                    while (i8 < size) {
                        int i9 = i8 + 1;
                        C0800d9 c0800d9 = (C0800d9) arrayList.get(i8);
                        if (!AbstractC0444k.m937a0(c0800d9.f3360u)) {
                            try {
                                DocumentsContract.deleteDocument(c1196q0.f6962a.getContentResolver(), Uri.parse(c0800d9.f3360u));
                            } catch (Throwable th) {
                                AbstractC1793a0.m2985m(th);
                            }
                        } else {
                            c1196q0.m2129p(c0800d9).delete();
                        }
                        i8 = i9;
                    }
                }
                C0242k0 c0242k0 = new C0242k0(12);
                this.f7453l = 1;
                c1196q0.m2109A(c0242k0);
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (c1694m == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            default:
                AbstractC1793a0.m2972L(obj);
                int i10 = this.f7453l;
                boolean z8 = this.f7452k;
                if (z8) {
                    str = "::1";
                } else {
                    str = "127.0.0.1";
                }
                try {
                    if (Runtime.getRuntime().exec(C0883ft.m1531e(str, 1, i10, z8, null, null)).waitFor() == 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    m2985m = Boolean.valueOf(z7);
                } catch (Throwable th2) {
                    m2985m = AbstractC1793a0.m2985m(th2);
                }
                Boolean bool = Boolean.FALSE;
                if (m2985m instanceof C1689h) {
                    return bool;
                }
                return m2985m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1257s(C0883ft c0883ft, boolean z7, int i7, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f7454m = c0883ft;
        this.f7452k = z7;
        this.f7453l = i7;
    }
}
