package p024c6;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p001a0.AbstractC0094y0;
import p060h5.AbstractC1797e;
import p060h5.AbstractC1806n;
import p060h5.C1818z;
import p158u5.AbstractC3367j;
import p195z5.C3877b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c6.e */
/* loaded from: classes.dex */
public final class C0438e extends AbstractC1797e {

    /* renamed from: e */
    public final /* synthetic */ int f1495e = 0;

    /* renamed from: f */
    public final Object f1496f;

    public C0438e(C0439f c0439f) {
        this.f1496f = c0439f;
    }

    @Override // p060h5.AbstractC1792a
    /* renamed from: a */
    public final int mo299a() {
        switch (this.f1495e) {
            case 0:
                return ((C0439f) this.f1496f).f1497a.groupCount() + 1;
            default:
                return ((List) this.f1496f).size();
        }
    }

    @Override // p060h5.AbstractC1792a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f1495e) {
            case 0:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.contains((String) obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i7) {
        switch (this.f1495e) {
            case 0:
                String group = ((C0439f) this.f1496f).f1497a.group(i7);
                if (group == null) {
                    return "";
                }
                return group;
            default:
                List list = (List) this.f1496f;
                if (i7 >= 0 && i7 <= AbstractC1806n.m3066N(this)) {
                    return list.get(AbstractC1806n.m3066N(this) - i7);
                }
                StringBuilder m188o = AbstractC0094y0.m188o(i7, "Element index ", " must be in range [");
                m188o.append(new C3877b(0, AbstractC1806n.m3066N(this), 1));
                m188o.append("].");
                throw new IndexOutOfBoundsException(m188o.toString());
        }
    }

    @Override // p060h5.AbstractC1797e, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f1495e) {
            case 0:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.indexOf((String) obj);
            default:
                return super.indexOf(obj);
        }
    }

    @Override // p060h5.AbstractC1797e, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f1495e) {
            case 1:
                return new C1818z(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // p060h5.AbstractC1797e, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f1495e) {
            case 0:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.lastIndexOf((String) obj);
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // p060h5.AbstractC1797e, java.util.List
    public ListIterator listIterator() {
        switch (this.f1495e) {
            case 1:
                return new C1818z(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // p060h5.AbstractC1797e, java.util.List
    public ListIterator listIterator(int i7) {
        switch (this.f1495e) {
            case 1:
                return new C1818z(this, i7);
            default:
                return super.listIterator(i7);
        }
    }

    public C0438e(List list) {
        AbstractC3367j.m5100e(list, "delegate");
        this.f1496f = list;
    }
}
