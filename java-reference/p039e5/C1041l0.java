package p039e5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1807o;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.l0 */
/* loaded from: classes.dex */
public final class C1041l0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public long f5350i;

    /* renamed from: j */
    public long f5351j;

    /* renamed from: k */
    public int f5352k;

    /* renamed from: l */
    public /* synthetic */ Object f5353l;

    /* renamed from: m */
    public final /* synthetic */ AtomicLong f5354m;

    /* renamed from: n */
    public final /* synthetic */ C1196q0 f5355n;

    /* renamed from: o */
    public final /* synthetic */ String f5356o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1041l0(AtomicLong atomicLong, C1196q0 c1196q0, String str, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f5354m = atomicLong;
        this.f5355n = c1196q0;
        this.f5356o = str;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1041l0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C1041l0 c1041l0 = new C1041l0(this.f5354m, this.f5355n, this.f5356o, interfaceC2313c);
        c1041l0.f5353l = obj;
        return c1041l0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0049 -> B:5:0x004c). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        InterfaceC0516a0 interfaceC0516a0;
        long j6;
        long nanoTime;
        long j7;
        Object value;
        ArrayList arrayList;
        int i7 = this.f5352k;
        AtomicLong atomicLong = this.f5354m;
        if (i7 != 0) {
            if (i7 == 1) {
                nanoTime = this.f5351j;
                j6 = this.f5350i;
                interfaceC0516a0 = (InterfaceC0516a0) this.f5353l;
                AbstractC1793a0.m2972L(obj);
                long nanoTime2 = System.nanoTime();
                long j8 = atomicLong.get();
                long j9 = (j8 - j6) * 1000000000;
                long j10 = nanoTime2 - nanoTime;
                if (j10 < 1) {
                    j10 = 1;
                }
                long j11 = j9 / j10;
                if (j11 >= 0) {
                    j7 = 0;
                } else {
                    j7 = j11;
                }
                C1701c0 c1701c0 = this.f5355n.f6971j;
                do {
                    value = c1701c0.getValue();
                    List<C0800d9> list = (List) value;
                    arrayList = new ArrayList(AbstractC1807o.m3073U(list));
                    for (C0800d9 c0800d9 : list) {
                        if (AbstractC3367j.m5096a(c0800d9.f3340a, this.f5356o)) {
                            c0800d9 = C0800d9.m1498a(c0800d9, null, null, null, 0L, j8, j7, false, null, 0L, null, null, 4169727);
                        }
                        arrayList.add(c0800d9);
                    }
                } while (!c1701c0.m2750g(value, arrayList));
                nanoTime = nanoTime2;
                j6 = j8;
                if (AbstractC0525d0.m1139q(interfaceC0516a0)) {
                    this.f5353l = interfaceC0516a0;
                    this.f5350i = j6;
                    this.f5351j = nanoTime;
                    this.f5352k = 1;
                    Object m1131i = AbstractC0525d0.m1131i(500L, this);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m1131i == enumC2465a) {
                        return enumC2465a;
                    }
                    long nanoTime22 = System.nanoTime();
                    long j82 = atomicLong.get();
                    long j92 = (j82 - j6) * 1000000000;
                    long j102 = nanoTime22 - nanoTime;
                    if (j102 < 1) {
                    }
                    long j112 = j92 / j102;
                    if (j112 >= 0) {
                    }
                    C1701c0 c1701c02 = this.f5355n.f6971j;
                    do {
                        value = c1701c02.getValue();
                        List<C0800d9> list2 = (List) value;
                        arrayList = new ArrayList(AbstractC1807o.m3073U(list2));
                        while (r6.hasNext()) {
                        }
                    } while (!c1701c02.m2750g(value, arrayList));
                    nanoTime = nanoTime22;
                    j6 = j82;
                    if (AbstractC0525d0.m1139q(interfaceC0516a0)) {
                        return C1694m.f10482a;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            interfaceC0516a0 = (InterfaceC0516a0) this.f5353l;
            j6 = atomicLong.get();
            nanoTime = System.nanoTime();
            if (AbstractC0525d0.m1139q(interfaceC0516a0)) {
            }
        }
    }
}
