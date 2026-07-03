package p146t1;

import java.util.ArrayList;
import java.util.List;
import p140s2.AbstractC3092b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.l0 */
/* loaded from: classes.dex */
public interface InterfaceC3217l0 {
    /* renamed from: a */
    InterfaceC3220m0 mo170a(InterfaceC3223n0 interfaceC3223n0, List list, long j6);

    /* renamed from: b */
    default int mo3109b(InterfaceC3228q interfaceC3228q, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new C3210j((InterfaceC3214k0) list.get(i8), EnumC3230r.f16036e, EnumC3232s.f16041f, 0));
        }
        return mo170a(new C3236u(interfaceC3228q, interfaceC3228q.getLayoutDirection()), arrayList, AbstractC3092b.m4765b(i7, 0, 13)).mo4884c();
    }

    /* renamed from: d */
    default int mo173d(InterfaceC3228q interfaceC3228q, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new C3210j((InterfaceC3214k0) list.get(i8), EnumC3230r.f16037f, EnumC3232s.f16040e, 0));
        }
        return mo170a(new C3236u(interfaceC3228q, interfaceC3228q.getLayoutDirection()), arrayList, AbstractC3092b.m4765b(0, i7, 7)).mo4886e();
    }

    /* renamed from: g */
    default int mo3112g(InterfaceC3228q interfaceC3228q, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new C3210j((InterfaceC3214k0) list.get(i8), EnumC3230r.f16036e, EnumC3232s.f16040e, 0));
        }
        return mo170a(new C3236u(interfaceC3228q, interfaceC3228q.getLayoutDirection()), arrayList, AbstractC3092b.m4765b(0, i7, 7)).mo4886e();
    }

    /* renamed from: h */
    default int mo3113h(InterfaceC3228q interfaceC3228q, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new C3210j((InterfaceC3214k0) list.get(i8), EnumC3230r.f16037f, EnumC3232s.f16041f, 0));
        }
        return mo170a(new C3236u(interfaceC3228q, interfaceC3228q.getLayoutDirection()), arrayList, AbstractC3092b.m4765b(i7, 0, 13)).mo4884c();
    }
}
