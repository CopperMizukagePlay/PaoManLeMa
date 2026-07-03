package p039e5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1807o;
import p060h5.C1813u;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.p0 */
/* loaded from: classes.dex */
public final class C1165p0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public long[] f6746i;

    /* renamed from: j */
    public long f6747j;

    /* renamed from: k */
    public int f6748k;

    /* renamed from: l */
    public /* synthetic */ Object f6749l;

    /* renamed from: m */
    public final /* synthetic */ List f6750m;

    /* renamed from: n */
    public final /* synthetic */ List f6751n;

    /* renamed from: o */
    public final /* synthetic */ C1196q0 f6752o;

    /* renamed from: p */
    public final /* synthetic */ String f6753p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165p0(List list, List list2, C1196q0 c1196q0, String str, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f6750m = list;
        this.f6751n = list2;
        this.f6752o = c1196q0;
        this.f6753p = str;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1165p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C1165p0 c1165p0 = new C1165p0(this.f6750m, this.f6751n, this.f6752o, this.f6753p, interfaceC2313c);
        c1165p0.f6749l = obj;
        return c1165p0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0079 A[LOOP:0: B:9:0x0077->B:10:0x0079, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012e A[LOOP:2: B:22:0x00b9->B:42:0x012e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129 A[EDGE_INSN: B:43:0x0129->B:44:0x0129 BREAK  A[LOOP:2: B:22:0x00b9->B:42:0x012e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x005e -> B:5:0x0061). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        InterfaceC0516a0 interfaceC0516a0;
        long[] jArr;
        long nanoTime;
        Object value;
        Map map;
        Iterable<C0831e9> iterable;
        Map map2;
        C0831e9 c0831e9;
        C1165p0 c1165p0 = this;
        int i7 = c1165p0.f6748k;
        List list = c1165p0.f6750m;
        int i8 = 1;
        if (i7 != 0) {
            if (i7 == 1) {
                nanoTime = c1165p0.f6747j;
                jArr = c1165p0.f6746i;
                interfaceC0516a0 = (InterfaceC0516a0) c1165p0.f6749l;
                AbstractC1793a0.m2972L(obj);
                long nanoTime2 = System.nanoTime();
                long j6 = nanoTime2 - nanoTime;
                if (j6 < 1) {
                    j6 = 1;
                }
                List list2 = c1165p0.f6751n;
                int size = list2.size();
                long[] jArr2 = new long[size];
                for (int i9 = 0; i9 < size; i9++) {
                    jArr2[i9] = ((AtomicLong) list2.get(i9)).get();
                }
                int size2 = list.size();
                long[] jArr3 = new long[size2];
                for (int i10 = 0; i10 < size2; i10++) {
                    long j7 = ((AtomicLong) list.get(i10)).get();
                    long j8 = ((j7 - jArr[i10]) * 1000000000) / j6;
                    if (j8 < 0) {
                        j8 = 0;
                    }
                    jArr[i10] = j7;
                    jArr3[i10] = j8;
                }
                C1701c0 c1701c0 = c1165p0.f6752o.f6973l;
                while (true) {
                    value = c1701c0.getValue();
                    map = (Map) value;
                    String str = c1165p0.f6753p;
                    iterable = (List) map.get(str);
                    if (iterable == null) {
                        iterable = C1813u.f10860e;
                    }
                    ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(iterable));
                    for (C0831e9 c0831e92 : iterable) {
                        int i11 = c0831e92.f3659a;
                        if (i11 >= 0 && i11 < size) {
                            c0831e9 = C0831e9.m1519a(c0831e92, 0L, 0L, jArr2[i11], jArr3[i11], null, null, 103);
                        } else {
                            c0831e9 = c0831e92;
                        }
                        arrayList.add(c0831e9);
                    }
                    if (!map.isEmpty()) {
                        Map singletonMap = Collections.singletonMap(str, arrayList);
                        AbstractC3367j.m5099d(singletonMap, "singletonMap(...)");
                        map2 = singletonMap;
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                        linkedHashMap.put(str, arrayList);
                        map2 = linkedHashMap;
                    }
                    i8 = 1;
                    if (!c1701c0.m2750g(value, map2)) {
                        break;
                    }
                    c1165p0 = this;
                }
                c1165p0 = this;
                nanoTime = nanoTime2;
                if (AbstractC0525d0.m1139q(interfaceC0516a0)) {
                    c1165p0.f6749l = interfaceC0516a0;
                    c1165p0.f6746i = jArr;
                    c1165p0.f6747j = nanoTime;
                    c1165p0.f6748k = i8;
                    Object m1131i = AbstractC0525d0.m1131i(500L, c1165p0);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m1131i == enumC2465a) {
                        return enumC2465a;
                    }
                    long nanoTime22 = System.nanoTime();
                    long j62 = nanoTime22 - nanoTime;
                    if (j62 < 1) {
                    }
                    List list22 = c1165p0.f6751n;
                    int size3 = list22.size();
                    long[] jArr22 = new long[size3];
                    while (i9 < size3) {
                    }
                    int size22 = list.size();
                    long[] jArr32 = new long[size22];
                    while (i10 < size22) {
                    }
                    C1701c0 c1701c02 = c1165p0.f6752o.f6973l;
                    while (true) {
                        value = c1701c02.getValue();
                        map = (Map) value;
                        String str2 = c1165p0.f6753p;
                        iterable = (List) map.get(str2);
                        if (iterable == null) {
                        }
                        ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(iterable));
                        while (r4.hasNext()) {
                        }
                        if (!map.isEmpty()) {
                        }
                        i8 = 1;
                        if (!c1701c02.m2750g(value, map2)) {
                        }
                        c1165p0 = this;
                    }
                    c1165p0 = this;
                    nanoTime = nanoTime22;
                    if (AbstractC0525d0.m1139q(interfaceC0516a0)) {
                        return C1694m.f10482a;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            InterfaceC0516a0 interfaceC0516a02 = (InterfaceC0516a0) c1165p0.f6749l;
            int size4 = list.size();
            long[] jArr4 = new long[size4];
            for (int i12 = 0; i12 < size4; i12++) {
                jArr4[i12] = ((AtomicLong) list.get(i12)).get();
            }
            interfaceC0516a0 = interfaceC0516a02;
            jArr = jArr4;
            nanoTime = System.nanoTime();
            if (AbstractC0525d0.m1139q(interfaceC0516a0)) {
            }
        }
    }
}
