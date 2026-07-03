package p024c6;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p039e5.AbstractC1092mk;
import p053g5.C1687f;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p195z5.C3877b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c6.s */
/* loaded from: classes.dex */
public final /* synthetic */ class C0452s implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f1510e;

    /* renamed from: f */
    public final /* synthetic */ List f1511f;

    public /* synthetic */ C0452s(List list) {
        this.f1510e = 0;
        this.f1511f = list;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo22d(Object obj, Object obj2) {
        int i7;
        int i8;
        int i9;
        Object obj3;
        C1687f c1687f;
        Object obj4;
        switch (this.f1510e) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                AbstractC3367j.m5100e(charSequence, "$this$DelimitedRangesSequence");
                List list = this.f1511f;
                if (list.size() == 1) {
                    int size = list.size();
                    if (size != 0) {
                        if (size == 1) {
                            String str = (String) list.get(0);
                            int m935Y = AbstractC0444k.m935Y(charSequence, str, intValue, false, 4);
                            if (m935Y >= 0) {
                                c1687f = new C1687f(Integer.valueOf(m935Y), str);
                                if (c1687f != null) {
                                    return null;
                                }
                                return new C1687f(c1687f.f10471e, Integer.valueOf(((String) c1687f.f10472f).length()));
                            }
                            c1687f = null;
                            if (c1687f != null) {
                            }
                        } else {
                            throw new IllegalArgumentException("List has more than one element.");
                        }
                    } else {
                        throw new NoSuchElementException("List is empty.");
                    }
                } else {
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    C3877b c3877b = new C3877b(intValue, charSequence.length(), 1);
                    boolean z7 = charSequence instanceof String;
                    int i10 = c3877b.f18165g;
                    int i11 = c3877b.f18164f;
                    if (z7) {
                        if ((i10 > 0 && intValue <= i11) || (i10 < 0 && i11 <= intValue)) {
                            int i12 = intValue;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str2 = (String) obj4;
                                        if (AbstractC0451r.m967I(str2, 0, (String) charSequence, i12, str2.length(), false)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    c1687f = new C1687f(Integer.valueOf(i12), str3);
                                } else if (i12 != i11) {
                                    i12 += i10;
                                }
                            }
                        }
                        c1687f = null;
                        if (c1687f != null) {
                        }
                    } else {
                        if ((i10 > 0 && intValue <= i11) || (i10 < 0 && i11 <= intValue)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        int i13 = i11;
                                        String str4 = (String) obj3;
                                        int i14 = i10;
                                        i7 = intValue;
                                        i8 = i14;
                                        i9 = i13;
                                        if (!AbstractC0444k.m942f0(str4, 0, charSequence, i7, str4.length(), false)) {
                                            i10 = i8;
                                            intValue = i7;
                                            i11 = i9;
                                        }
                                    } else {
                                        int i15 = i10;
                                        i7 = intValue;
                                        i8 = i15;
                                        i9 = i11;
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    c1687f = new C1687f(Integer.valueOf(i7), str5);
                                } else if (i7 != i9) {
                                    int i16 = i7 + i8;
                                    i10 = i8;
                                    intValue = i16;
                                    i11 = i9;
                                }
                            }
                        }
                        c1687f = null;
                        if (c1687f != null) {
                        }
                    }
                }
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1092mk.m1761a(this.f1511f, (C2395p) obj, AbstractC2418w.m3957F(1));
                return C1694m.f10482a;
            default:
                ((Integer) obj2).getClass();
                AbstractC1092mk.m1816l(this.f1511f, (C2395p) obj, AbstractC2418w.m3957F(1));
                return C1694m.f10482a;
        }
    }

    public /* synthetic */ C0452s(List list, int i7, int i8) {
        this.f1510e = i8;
        this.f1511f = list;
    }
}
