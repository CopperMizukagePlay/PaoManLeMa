package p070j;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j.a */
/* loaded from: classes.dex */
public final class C2109a implements Iterable {

    /* renamed from: e */
    public C2111c f12387e;

    /* renamed from: f */
    public C2111c f12388f;

    /* renamed from: g */
    public final WeakHashMap f12389g = new WeakHashMap();

    /* renamed from: h */
    public int f12390h = 0;

    /* renamed from: i */
    public final HashMap f12391i = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((p070j.C2110b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2109a)) {
            return false;
        }
        C2109a c2109a = (C2109a) obj;
        if (this.f12390h != c2109a.f12390h) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c2109a.iterator();
        while (true) {
            C2110b c2110b = (C2110b) it;
            if (!c2110b.hasNext()) {
                break;
            }
            C2110b c2110b2 = (C2110b) it2;
            if (!c2110b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c2110b.next();
            Object next = c2110b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i7 = 0;
        while (true) {
            C2110b c2110b = (C2110b) it;
            if (c2110b.hasNext()) {
                i7 += ((Map.Entry) c2110b.next()).hashCode();
            } else {
                return i7;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2110b c2110b = new C2110b(this.f12387e, this.f12388f, 0);
        this.f12389g.put(c2110b, Boolean.FALSE);
        return c2110b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C2110b c2110b = (C2110b) it;
            if (c2110b.hasNext()) {
                sb.append(((Map.Entry) c2110b.next()).toString());
                if (c2110b.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
