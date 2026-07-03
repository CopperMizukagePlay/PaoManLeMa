package p022c4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p067i4.C2069b;
import p089l4.C2464a;
import p112o4.C2817a;
import p126q4.C2992g;
import p187y4.C3851a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c4.i */
/* loaded from: classes.dex */
public final class C0399i implements InterfaceC0402l {

    /* renamed from: c */
    public static final InterfaceC0402l[] f1362c = new InterfaceC0402l[0];

    /* renamed from: a */
    public Map f1363a;

    /* renamed from: b */
    public InterfaceC0402l[] f1364b;

    @Override // p022c4.InterfaceC0402l
    /* renamed from: a */
    public final C0404n mo875a(C0392b c0392b, Map map) {
        m877c(map);
        return m876b(c0392b);
    }

    /* renamed from: b */
    public final C0404n m876b(C0392b c0392b) {
        InterfaceC0402l[] interfaceC0402lArr = this.f1364b;
        if (interfaceC0402lArr != null) {
            for (InterfaceC0402l interfaceC0402l : interfaceC0402lArr) {
                if (!Thread.currentThread().isInterrupted()) {
                    try {
                        return interfaceC0402l.mo875a(c0392b, this.f1363a);
                    } catch (AbstractC0403m unused) {
                    }
                } else {
                    throw C0400j.m878a();
                }
            }
            Map map = this.f1363a;
            if (map != null && map.containsKey(EnumC0394d.ALSO_INVERTED)) {
                C2069b m865a = c0392b.m865a();
                int length = m865a.f12261h.length;
                for (int i7 = 0; i7 < length; i7++) {
                    int[] iArr = m865a.f12261h;
                    iArr[i7] = ~iArr[i7];
                }
                for (InterfaceC0402l interfaceC0402l2 : this.f1364b) {
                    if (!Thread.currentThread().isInterrupted()) {
                        try {
                            return interfaceC0402l2.mo875a(c0392b, this.f1363a);
                        } catch (AbstractC0403m unused2) {
                        }
                    } else {
                        throw C0400j.m878a();
                    }
                }
            }
        }
        throw C0400j.m878a();
    }

    /* renamed from: c */
    public final void m877c(Map map) {
        boolean z7;
        Collection collection;
        this.f1363a = map;
        boolean z8 = false;
        if (map != null && map.containsKey(EnumC0394d.TRY_HARDER)) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(EnumC0394d.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC0391a.f1329s) || collection.contains(EnumC0391a.f1330t) || collection.contains(EnumC0391a.f1322l) || collection.contains(EnumC0391a.f1321k) || collection.contains(EnumC0391a.f1316f) || collection.contains(EnumC0391a.f1317g) || collection.contains(EnumC0391a.f1318h) || collection.contains(EnumC0391a.f1319i) || collection.contains(EnumC0391a.f1323m) || collection.contains(EnumC0391a.f1327q) || collection.contains(EnumC0391a.f1328r)) {
                z8 = true;
            }
            if (z8 && !z7) {
                arrayList.add(new C2992g(map, 0));
            }
            if (collection.contains(EnumC0391a.f1326p)) {
                arrayList.add(new C3851a());
            }
            if (collection.contains(EnumC0391a.f1320j)) {
                arrayList.add(new C2464a());
            }
            if (collection.contains(EnumC0391a.f1315e)) {
                arrayList.add(new Object());
            }
            if (collection.contains(EnumC0391a.f1325o)) {
                arrayList.add(new Object());
            }
            if (collection.contains(EnumC0391a.f1324n)) {
                arrayList.add(new C2817a());
            }
            if (z8 && z7) {
                arrayList.add(new C2992g(map, 0));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z7) {
                arrayList.add(new C2992g(map, 0));
            }
            arrayList.add(new C3851a());
            arrayList.add(new C2464a());
            arrayList.add(new Object());
            arrayList.add(new Object());
            arrayList.add(new C2817a());
            if (z7) {
                arrayList.add(new C2992g(map, 0));
            }
        }
        this.f1364b = (InterfaceC0402l[]) arrayList.toArray(f1362c);
    }

    @Override // p022c4.InterfaceC0402l
    public final void reset() {
        InterfaceC0402l[] interfaceC0402lArr = this.f1364b;
        if (interfaceC0402lArr != null) {
            for (InterfaceC0402l interfaceC0402l : interfaceC0402lArr) {
                interfaceC0402l.reset();
            }
        }
    }
}
