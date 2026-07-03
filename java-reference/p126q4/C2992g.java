package p126q4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p022c4.AbstractC0403m;
import p022c4.C0400j;
import p022c4.C0404n;
import p022c4.EnumC0391a;
import p022c4.EnumC0394d;
import p067i4.C2068a;
import p134r4.C3053e;
import p142s4.C3111c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q4.g */
/* loaded from: classes.dex */
public final class C2992g extends AbstractC2993h {

    /* renamed from: c */
    public static final AbstractC2993h[] f15447c = new AbstractC2993h[0];

    /* renamed from: d */
    public static final AbstractC2996k[] f15448d = new AbstractC2996k[0];

    /* renamed from: a */
    public final /* synthetic */ int f15449a;

    /* renamed from: b */
    public final AbstractC2993h[] f15450b;

    public C2992g(Map map, int i7) {
        Collection collection;
        Collection collection2;
        boolean z7;
        this.f15449a = i7;
        switch (i7) {
            case 1:
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(EnumC0394d.POSSIBLE_FORMATS);
                }
                ArrayList arrayList = new ArrayList();
                if (collection != null) {
                    if (collection.contains(EnumC0391a.f1322l)) {
                        arrayList.add(new C2990e(0));
                    } else if (collection.contains(EnumC0391a.f1329s)) {
                        arrayList.add(new C2990e(3));
                    }
                    if (collection.contains(EnumC0391a.f1321k)) {
                        arrayList.add(new C2990e(2));
                    }
                    if (collection.contains(EnumC0391a.f1330t)) {
                        arrayList.add(new C2990e(1));
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(new C2990e(0));
                    arrayList.add(new C2990e(2));
                    arrayList.add(new C2990e(1));
                }
                this.f15450b = (AbstractC2996k[]) arrayList.toArray(f15448d);
                return;
            default:
                if (map == null) {
                    collection2 = null;
                } else {
                    collection2 = (Collection) map.get(EnumC0394d.POSSIBLE_FORMATS);
                }
                if (map != null && map.get(EnumC0394d.ASSUME_CODE_39_CHECK_DIGIT) != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                ArrayList arrayList2 = new ArrayList();
                if (collection2 != null) {
                    if (collection2.contains(EnumC0391a.f1322l) || collection2.contains(EnumC0391a.f1329s) || collection2.contains(EnumC0391a.f1321k) || collection2.contains(EnumC0391a.f1330t)) {
                        arrayList2.add(new C2992g(map, 1));
                    }
                    if (collection2.contains(EnumC0391a.f1317g)) {
                        arrayList2.add(new C2988c(z7));
                    }
                    if (collection2.contains(EnumC0391a.f1318h)) {
                        arrayList2.add(new C2989d());
                    }
                    if (collection2.contains(EnumC0391a.f1319i)) {
                        arrayList2.add(new Object());
                    }
                    if (collection2.contains(EnumC0391a.f1323m)) {
                        arrayList2.add(new C2991f());
                    }
                    if (collection2.contains(EnumC0391a.f1316f)) {
                        arrayList2.add(new C2986a());
                    }
                    if (collection2.contains(EnumC0391a.f1327q)) {
                        arrayList2.add(new C3053e());
                    }
                    if (collection2.contains(EnumC0391a.f1328r)) {
                        arrayList2.add(new C3111c());
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(new C2992g(map, 1));
                    arrayList2.add(new C2988c(false));
                    arrayList2.add(new C2986a());
                    arrayList2.add(new C2989d());
                    arrayList2.add(new Object());
                    arrayList2.add(new C2991f());
                    arrayList2.add(new C3053e());
                    arrayList2.add(new C3111c());
                }
                this.f15450b = (AbstractC2993h[]) arrayList2.toArray(f15447c);
                return;
        }
    }

    @Override // p126q4.AbstractC2993h
    /* renamed from: b */
    public final C0404n mo4642b(int i7, C2068a c2068a, Map map) {
        boolean z7;
        Collection collection;
        boolean z8;
        switch (this.f15449a) {
            case 0:
                for (AbstractC2993h abstractC2993h : this.f15450b) {
                    try {
                        return abstractC2993h.mo4642b(i7, c2068a, map);
                    } catch (AbstractC0403m unused) {
                    }
                }
                throw C0400j.m878a();
            default:
                int[] m4665m = AbstractC2996k.m4665m(c2068a);
                for (AbstractC2996k abstractC2996k : (AbstractC2996k[]) this.f15450b) {
                    try {
                        C0404n mo4651k = abstractC2996k.mo4651k(i7, c2068a, m4665m, map);
                        if (mo4651k.f1374d == EnumC0391a.f1322l && mo4651k.f1371a.charAt(0) == '0') {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (map == null) {
                            collection = null;
                        } else {
                            collection = (Collection) map.get(EnumC0394d.POSSIBLE_FORMATS);
                        }
                        EnumC0391a enumC0391a = EnumC0391a.f1329s;
                        if (collection != null && !collection.contains(enumC0391a)) {
                            z8 = false;
                            if (!z7 && z8) {
                                C0404n c0404n = new C0404n(mo4651k.f1371a.substring(1), mo4651k.f1372b, mo4651k.f1373c, enumC0391a);
                                c0404n.m879a(mo4651k.f1375e);
                                return c0404n;
                            }
                        }
                        z8 = true;
                        return !z7 ? mo4651k : mo4651k;
                    } catch (AbstractC0403m unused2) {
                    }
                }
                throw C0400j.m878a();
        }
    }

    @Override // p126q4.AbstractC2993h, p022c4.InterfaceC0402l
    public final void reset() {
        switch (this.f15449a) {
            case 0:
                for (AbstractC2993h abstractC2993h : this.f15450b) {
                    abstractC2993h.reset();
                }
                return;
            default:
                for (AbstractC2996k abstractC2996k : (AbstractC2996k[]) this.f15450b) {
                    abstractC2996k.getClass();
                }
                return;
        }
    }
}
