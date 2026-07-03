package p092m;

import java.util.ArrayList;
import java.util.List;
import p034e0.C0608h0;
import p060h5.AbstractC1806n;
import p060h5.C1814v;
import p067i4.AbstractC2072e;
import p140s2.C3102l;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3217l0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p146t1.InterfaceC3228q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.c */
/* loaded from: classes.dex */
public final class C2485c implements InterfaceC3217l0 {

    /* renamed from: a */
    public final C2493i f13784a;

    /* renamed from: b */
    public boolean f13785b;

    public C2485c(C2493i c2493i) {
        this.f13784a = c2493i;
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: a */
    public final InterfaceC3220m0 mo170a(InterfaceC3223n0 interfaceC3223n0, List list, long j6) {
        Object obj;
        int i7;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(((InterfaceC3214k0) list.get(i9)).mo4918e(j6));
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i10 = ((AbstractC3239v0) obj).f16053e;
            int m3066N = AbstractC1806n.m3066N(arrayList);
            if (1 <= m3066N) {
                int i11 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i11);
                    int i12 = ((AbstractC3239v0) obj3).f16053e;
                    if (i10 < i12) {
                        obj = obj3;
                        i10 = i12;
                    }
                    if (i11 == m3066N) {
                        break;
                    }
                    i11++;
                }
            }
        }
        AbstractC3239v0 abstractC3239v0 = (AbstractC3239v0) obj;
        if (abstractC3239v0 != null) {
            i7 = abstractC3239v0.f16053e;
        } else {
            i7 = 0;
        }
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i13 = ((AbstractC3239v0) obj2).f16054f;
            int m3066N2 = AbstractC1806n.m3066N(arrayList);
            if (1 <= m3066N2) {
                int i14 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i14);
                    int i15 = ((AbstractC3239v0) obj4).f16054f;
                    if (i13 < i15) {
                        obj2 = obj4;
                        i13 = i15;
                    }
                    if (i14 == m3066N2) {
                        break;
                    }
                    i14++;
                }
            }
        }
        AbstractC3239v0 abstractC3239v02 = (AbstractC3239v0) obj2;
        if (abstractC3239v02 != null) {
            i8 = abstractC3239v02.f16054f;
        }
        boolean mo4889s = interfaceC3223n0.mo4889s();
        C2493i c2493i = this.f13784a;
        if (mo4889s) {
            this.f13785b = true;
            c2493i.f13806a.setValue(new C3102l(AbstractC2072e.m3326b(i7, i8)));
        } else if (!this.f13785b) {
            c2493i.f13806a.setValue(new C3102l(AbstractC2072e.m3326b(i7, i8)));
        }
        return interfaceC3223n0.mo4941K(i7, i8, C1814v.f10861e, new C0608h0(2, arrayList));
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: b */
    public final int mo3109b(InterfaceC3228q interfaceC3228q, List list, int i7) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC3214k0) list.get(0)).mo4919e0(i7));
            int m3066N = AbstractC1806n.m3066N(list);
            int i8 = 1;
            if (1 <= m3066N) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC3214k0) list.get(i8)).mo4919e0(i7));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i8 == m3066N) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: d */
    public final int mo173d(InterfaceC3228q interfaceC3228q, List list, int i7) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC3214k0) list.get(0)).mo4917c0(i7));
            int m3066N = AbstractC1806n.m3066N(list);
            int i8 = 1;
            if (1 <= m3066N) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC3214k0) list.get(i8)).mo4917c0(i7));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i8 == m3066N) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: g */
    public final int mo3112g(InterfaceC3228q interfaceC3228q, List list, int i7) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC3214k0) list.get(0)).mo4916V(i7));
            int m3066N = AbstractC1806n.m3066N(list);
            int i8 = 1;
            if (1 <= m3066N) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC3214k0) list.get(i8)).mo4916V(i7));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i8 == m3066N) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: h */
    public final int mo3113h(InterfaceC3228q interfaceC3228q, List list, int i7) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC3214k0) list.get(0)).mo4920f(i7));
            int m3066N = AbstractC1806n.m3066N(list);
            int i8 = 1;
            if (1 <= m3066N) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC3214k0) list.get(i8)).mo4920f(i7));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i8 == m3066N) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }
}
