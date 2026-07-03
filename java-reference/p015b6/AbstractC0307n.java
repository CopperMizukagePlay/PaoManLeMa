package p015b6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p008b.C0242k0;
import p060h5.C1813u;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p174w5.AbstractC3784a;

/* renamed from: b6.n */
/* loaded from: classes.dex */
public abstract class AbstractC0307n extends AbstractC0309p {
    /* renamed from: C */
    public static InterfaceC0305l m664C(Iterator it) {
        AbstractC3367j.m5100e(it, "<this>");
        return new C0294a(new C0308o(1, it));
    }

    /* renamed from: D */
    public static Object m665D(InterfaceC0305l interfaceC0305l) {
        Iterator it = interfaceC0305l.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: E */
    public static String m666E(InterfaceC0305l interfaceC0305l, String str) {
        AbstractC3367j.m5100e(interfaceC0305l, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i7 = 0;
        for (Object obj : interfaceC0305l) {
            i7++;
            if (i7 > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC3393k.m5136g(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* renamed from: F */
    public static C0301h m667F(InterfaceC0305l interfaceC0305l, InterfaceC3279c interfaceC3279c) {
        return new C0301h(new C0302i(interfaceC0305l, interfaceC3279c, 1), false, new C0242k0(1));
    }

    /* renamed from: G */
    public static List m668G(InterfaceC0305l interfaceC0305l) {
        Iterator it = interfaceC0305l.iterator();
        if (!it.hasNext()) {
            return C1813u.f10860e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC3784a.m5817z(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
