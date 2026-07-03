package androidx.compose.foundation.text.modifiers;

import p026d0.C0459d;
import p026d0.C0462g;
import p050g2.C1604o0;
import p080k2.InterfaceC2293d;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final String f725a;

    /* renamed from: b */
    public final C1604o0 f726b;

    /* renamed from: c */
    public final InterfaceC2293d f727c;

    /* renamed from: d */
    public final int f728d;

    /* renamed from: e */
    public final boolean f729e;

    /* renamed from: f */
    public final int f730f;

    /* renamed from: g */
    public final int f731g;

    public TextStringSimpleElement(String str, C1604o0 c1604o0, InterfaceC2293d interfaceC2293d, int i7, boolean z7, int i8, int i9) {
        this.f725a = str;
        this.f726b = c1604o0;
        this.f727c = interfaceC2293d;
        this.f728d = i7;
        this.f729e = z7;
        this.f730f = i8;
        this.f731g = i9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextStringSimpleElement) {
                TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
                if (AbstractC3367j.m5096a(this.f725a, textStringSimpleElement.f725a) && AbstractC3367j.m5096a(this.f726b, textStringSimpleElement.f726b) && AbstractC3367j.m5096a(this.f727c, textStringSimpleElement.f727c) && this.f728d == textStringSimpleElement.f728d && this.f729e == textStringSimpleElement.f729e && this.f730f == textStringSimpleElement.f730f && this.f731g == textStringSimpleElement.f731g) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d0.g, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f1611s = this.f725a;
        abstractC3809q.f1612t = this.f726b;
        abstractC3809q.f1613u = this.f727c;
        abstractC3809q.f1614v = this.f728d;
        abstractC3809q.f1615w = this.f729e;
        abstractC3809q.f1616x = this.f730f;
        abstractC3809q.f1617y = this.f731g;
        return abstractC3809q;
    }

    public final int hashCode() {
        return (((AbstractC2487d.m4040d(AbstractC2647h.m4255a(this.f728d, (this.f727c.hashCode() + ((this.f726b.hashCode() + (this.f725a.hashCode() * 31)) * 31)) * 31, 31), 31, this.f729e) + this.f730f) * 31) + this.f731g) * 31;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        boolean z7;
        String str;
        String str2;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z8;
        boolean z9;
        InterfaceC2293d interfaceC2293d;
        InterfaceC2293d interfaceC2293d2;
        int i11;
        int i12;
        C0462g c0462g = (C0462g) abstractC3809q;
        c0462g.getClass();
        C1604o0 c1604o0 = c0462g.f1612t;
        boolean z10 = false;
        boolean z11 = true;
        C1604o0 c1604o02 = this.f726b;
        if (c1604o02 != c1604o0) {
            if (!c1604o02.f10309a.m2567b(c1604o0.f10309a)) {
                z7 = true;
                str = c0462g.f1611s;
                str2 = this.f725a;
                if (!AbstractC3367j.m5096a(str, str2)) {
                    c0462g.f1611s = str2;
                    c0462g.f1610C = null;
                    z10 = true;
                }
                boolean z12 = !c0462g.f1612t.m2595c(c1604o02);
                c0462g.f1612t = c1604o02;
                i7 = c0462g.f1617y;
                i8 = this.f731g;
                if (i7 != i8) {
                    c0462g.f1617y = i8;
                    z12 = true;
                }
                i9 = c0462g.f1616x;
                i10 = this.f730f;
                if (i9 != i10) {
                    c0462g.f1616x = i10;
                    z12 = true;
                }
                z8 = c0462g.f1615w;
                z9 = this.f729e;
                if (z8 != z9) {
                    c0462g.f1615w = z9;
                    z12 = true;
                }
                interfaceC2293d = c0462g.f1613u;
                interfaceC2293d2 = this.f727c;
                if (!AbstractC3367j.m5096a(interfaceC2293d, interfaceC2293d2)) {
                    c0462g.f1613u = interfaceC2293d2;
                    z12 = true;
                }
                i11 = c0462g.f1614v;
                i12 = this.f728d;
                if (i11 != i12) {
                    z11 = z12;
                } else {
                    c0462g.f1614v = i12;
                }
                if (!z10 || z11) {
                    C0459d m1000K0 = c0462g.m1000K0();
                    String str3 = c0462g.f1611s;
                    C1604o0 c1604o03 = c0462g.f1612t;
                    InterfaceC2293d interfaceC2293d3 = c0462g.f1613u;
                    int i13 = c0462g.f1614v;
                    boolean z13 = c0462g.f1615w;
                    int i14 = c0462g.f1616x;
                    int i15 = c0462g.f1617y;
                    m1000K0.f1584a = str3;
                    m1000K0.f1585b = c1604o03;
                    m1000K0.f1586c = interfaceC2293d3;
                    m1000K0.f1587d = i13;
                    m1000K0.f1588e = z13;
                    m1000K0.f1589f = i14;
                    m1000K0.f1590g = i15;
                    m1000K0.m997c();
                }
                if (!c0462g.f18005r) {
                    if (z10 || (z7 && c0462g.f1609B != null)) {
                        AbstractC3498f.m5375o(c0462g);
                    }
                    if (z10 || z11) {
                        AbstractC3498f.m5374n(c0462g);
                        AbstractC3498f.m5373m(c0462g);
                    }
                    if (z7) {
                        AbstractC3498f.m5373m(c0462g);
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            c1604o02.getClass();
        }
        z7 = false;
        str = c0462g.f1611s;
        str2 = this.f725a;
        if (!AbstractC3367j.m5096a(str, str2)) {
        }
        boolean z122 = !c0462g.f1612t.m2595c(c1604o02);
        c0462g.f1612t = c1604o02;
        i7 = c0462g.f1617y;
        i8 = this.f731g;
        if (i7 != i8) {
        }
        i9 = c0462g.f1616x;
        i10 = this.f730f;
        if (i9 != i10) {
        }
        z8 = c0462g.f1615w;
        z9 = this.f729e;
        if (z8 != z9) {
        }
        interfaceC2293d = c0462g.f1613u;
        interfaceC2293d2 = this.f727c;
        if (!AbstractC3367j.m5096a(interfaceC2293d, interfaceC2293d2)) {
        }
        i11 = c0462g.f1614v;
        i12 = this.f728d;
        if (i11 != i12) {
        }
        if (!z10) {
        }
        C0459d m1000K02 = c0462g.m1000K0();
        String str32 = c0462g.f1611s;
        C1604o0 c1604o032 = c0462g.f1612t;
        InterfaceC2293d interfaceC2293d32 = c0462g.f1613u;
        int i132 = c0462g.f1614v;
        boolean z132 = c0462g.f1615w;
        int i142 = c0462g.f1616x;
        int i152 = c0462g.f1617y;
        m1000K02.f1584a = str32;
        m1000K02.f1585b = c1604o032;
        m1000K02.f1586c = interfaceC2293d32;
        m1000K02.f1587d = i132;
        m1000K02.f1588e = z132;
        m1000K02.f1589f = i142;
        m1000K02.f1590g = i152;
        m1000K02.m997c();
        if (!c0462g.f18005r) {
        }
    }
}
