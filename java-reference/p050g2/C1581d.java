package p050g2;

import java.util.ArrayList;
import java.util.List;
import p095m2.AbstractC2550a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.d */
/* loaded from: classes.dex */
public final class C1581d implements Appendable {

    /* renamed from: e */
    public final StringBuilder f10206e = new StringBuilder(16);

    /* renamed from: f */
    public final ArrayList f10207f;

    public C1581d(C1587g c1587g) {
        new ArrayList();
        this.f10207f = new ArrayList();
        new ArrayList();
        m2554a(c1587g);
    }

    /* renamed from: a */
    public final void m2554a(C1587g c1587g) {
        StringBuilder sb = this.f10206e;
        int length = sb.length();
        sb.append(c1587g.f10239f);
        List list = c1587g.f10238e;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                C1583e c1583e = (C1583e) list.get(i7);
                this.f10207f.add(new C1579c(c1583e.f10229a, c1583e.f10230b + length, c1583e.f10231c + length, c1583e.f10232d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C1587g) {
            m2554a((C1587g) charSequence);
            return this;
        }
        this.f10206e.append(charSequence);
        return this;
    }

    /* renamed from: b */
    public final C1587g m2555b() {
        StringBuilder sb = this.f10206e;
        String sb2 = sb.toString();
        ArrayList arrayList = this.f10207f;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1579c c1579c = (C1579c) arrayList.get(i7);
            int length = sb.length();
            int i8 = c1579c.f10202c;
            if (i8 != Integer.MIN_VALUE) {
                length = i8;
            }
            if (length == Integer.MIN_VALUE) {
                AbstractC2550a.m4079b("Item.end should be set first");
            }
            arrayList2.add(new C1583e(c1579c.f10200a, c1579c.f10201b, length, c1579c.f10203d));
        }
        return new C1587g(sb2, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i7, int i8) {
        boolean z7 = charSequence instanceof C1587g;
        StringBuilder sb = this.f10206e;
        if (z7) {
            C1587g c1587g = (C1587g) charSequence;
            int length = sb.length();
            sb.append((CharSequence) c1587g.f10239f, i7, i8);
            List m2569a = AbstractC1589h.m2569a(c1587g, i7, i8, null);
            if (m2569a != null) {
                int size = m2569a.size();
                for (int i9 = 0; i9 < size; i9++) {
                    C1583e c1583e = (C1583e) m2569a.get(i9);
                    this.f10207f.add(new C1579c(c1583e.f10229a, c1583e.f10230b + length, c1583e.f10231c + length, c1583e.f10232d));
                }
            }
            return this;
        }
        sb.append(charSequence, i7, i8);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c7) {
        this.f10206e.append(c7);
        return this;
    }
}
