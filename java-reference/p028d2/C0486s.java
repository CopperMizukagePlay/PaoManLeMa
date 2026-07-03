package p028d2;

import java.util.ArrayList;
import java.util.List;
import p035e1.InterfaceC0667m0;
import p053g5.C1694m;
import p053g5.InterfaceC1684c;
import p060h5.AbstractC1805m;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p183y0.C3835d;
import p183y0.InterfaceC3844m;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d2.s */
/* loaded from: classes.dex */
public final class C0486s extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: g */
    public static final C0486s f1705g;

    /* renamed from: h */
    public static final C0486s f1706h;

    /* renamed from: i */
    public static final C0486s f1707i;

    /* renamed from: j */
    public static final C0486s f1708j;

    /* renamed from: k */
    public static final C0486s f1709k;

    /* renamed from: l */
    public static final C0486s f1710l;

    /* renamed from: m */
    public static final C0486s f1711m;

    /* renamed from: n */
    public static final C0486s f1712n;

    /* renamed from: o */
    public static final C0486s f1713o;

    /* renamed from: p */
    public static final C0486s f1714p;

    /* renamed from: q */
    public static final C0486s f1715q;

    /* renamed from: r */
    public static final C0486s f1716r;

    /* renamed from: s */
    public static final C0486s f1717s;

    /* renamed from: t */
    public static final C0486s f1718t;

    /* renamed from: u */
    public static final C0486s f1719u;

    /* renamed from: v */
    public static final C0486s f1720v;

    /* renamed from: w */
    public static final C0486s f1721w;

    /* renamed from: x */
    public static final C0486s f1722x;

    /* renamed from: y */
    public static final C0486s f1723y;

    /* renamed from: f */
    public final /* synthetic */ int f1724f;

    static {
        int i7 = 2;
        f1705g = new C0486s(i7, 0);
        f1706h = new C0486s(i7, 1);
        f1707i = new C0486s(i7, 2);
        f1708j = new C0486s(i7, 3);
        f1709k = new C0486s(i7, 4);
        f1710l = new C0486s(i7, 5);
        f1711m = new C0486s(i7, 6);
        f1712n = new C0486s(i7, 7);
        f1713o = new C0486s(i7, 8);
        f1714p = new C0486s(i7, 9);
        f1715q = new C0486s(i7, 10);
        f1716r = new C0486s(i7, 11);
        f1717s = new C0486s(i7, 12);
        f1718t = new C0486s(i7, 13);
        f1719u = new C0486s(i7, 14);
        f1720v = new C0486s(i7, 15);
        f1721w = new C0486s(i7, 16);
        f1722x = new C0486s(i7, 17);
        f1723y = new C0486s(i7, 18);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0486s(int i7, int i8) {
        super(i7);
        this.f1724f = i8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        String str;
        InterfaceC1684c interfaceC1684c;
        switch (this.f1724f) {
            case 0:
                return (C3835d) obj;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list != null) {
                    ArrayList m3036D0 = AbstractC1805m.m3036D0(list);
                    m3036D0.addAll(list2);
                    return m3036D0;
                }
                return list2;
            case 2:
                return (InterfaceC3844m) obj;
            case 3:
                return (C1694m) obj;
            case 4:
                return (C1694m) obj;
            case AbstractC3122c.f15761f /* 5 */:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case AbstractC3122c.f15759d /* 6 */:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 7:
                return (C1694m) obj;
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case AbstractC3122c.f15758c /* 9 */:
                C0474g c0474g = (C0474g) obj;
                int i7 = ((C0474g) obj2).f1652a;
                return c0474g;
            case AbstractC3122c.f15760e /* 10 */:
                return (InterfaceC0667m0) obj;
            case 11:
                return (String) obj;
            case 12:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 != null) {
                    ArrayList m3036D02 = AbstractC1805m.m3036D0(list3);
                    m3036D02.addAll(list4);
                    return m3036D02;
                }
                return list4;
            case 13:
                Float f7 = (Float) obj;
                ((Number) obj2).floatValue();
                return f7;
            case 14:
                return (String) obj;
            case AbstractC3122c.f15762g /* 15 */:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 16:
                C0468a c0468a = (C0468a) obj;
                C0468a c0468a2 = (C0468a) obj2;
                if (c0468a == null || (str = c0468a.f1638a) == null) {
                    str = c0468a2.f1638a;
                }
                if (c0468a == null || (interfaceC1684c = c0468a.f1639b) == null) {
                    interfaceC1684c = c0468a2.f1639b;
                }
                return new C0468a(str, interfaceC1684c);
            case 17:
                if (obj == null) {
                    return obj2;
                }
                return obj;
            default:
                C0482o c0482o = (C0482o) obj2;
                Object valueOf = Float.valueOf(0.0f);
                C0477j c0477j = ((C0482o) obj).f1694d;
                C0490w c0490w = AbstractC0487t.f1758s;
                Object m3592g = c0477j.f1683e.m3592g(c0490w);
                if (m3592g == null) {
                    m3592g = valueOf;
                }
                float floatValue = ((Number) m3592g).floatValue();
                Object m3592g2 = c0482o.f1694d.f1683e.m3592g(c0490w);
                if (m3592g2 != null) {
                    valueOf = m3592g2;
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) valueOf).floatValue()));
        }
    }
}
