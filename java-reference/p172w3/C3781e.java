package p172w3;

import android.os.Bundle;
import androidx.lifecycle.C0195k;
import androidx.lifecycle.EnumC0203o;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p053g5.C1687f;
import p066i3.AbstractC2067b;
import p099m6.C2592a0;
import p099m6.C2598d0;
import p099m6.C2617r;
import p106n6.AbstractC2721b;
import p128q6.C3002e;
import p128q6.C3006i;
import p128q6.C3008k;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p173w4.C3783a;
import p186y3.C3850a;
import p195z5.C3877b;
import p196z6.C3887f;
import p196z6.C3888g;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w3.e */
/* loaded from: classes.dex */
public final class C3781e {

    /* renamed from: a */
    public final /* synthetic */ int f17916a;

    /* renamed from: b */
    public final Object f17917b;

    /* renamed from: c */
    public Object f17918c;

    public C3781e(C3850a c3850a, int i7) {
        this.f17916a = i7;
        switch (i7) {
            case 1:
                this.f17917b = c3850a;
                this.f17918c = new C3781e(c3850a, 0);
                return;
            default:
                this.f17917b = c3850a;
                return;
        }
    }

    /* renamed from: a */
    public C3781e m5776a(C3781e c3781e) {
        C3783a c3783a = (C3783a) this.f17917b;
        if (c3783a.equals((C3783a) c3781e.f17917b)) {
            if (m5781f()) {
                return c3781e;
            }
            if (c3781e.m5781f()) {
                return this;
            }
            int[] iArr = (int[]) this.f17918c;
            int[] iArr2 = (int[]) c3781e.f17918c;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i7 = length; i7 < iArr.length; i7++) {
                iArr3[i7] = c3783a.m5790a(iArr2[i7 - length], iArr[i7]);
            }
            return new C3781e(c3783a, iArr3);
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    /* renamed from: b */
    public Bundle m5777b(String str) {
        Bundle bundle;
        AbstractC3367j.m5100e(str, "key");
        C3850a c3850a = (C3850a) this.f17917b;
        if (c3850a.f18083g) {
            Bundle bundle2 = c3850a.f18082f;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2.containsKey(str)) {
                bundle = AbstractC2067b.m3292q(str, bundle2);
            } else {
                bundle = null;
            }
            bundle2.remove(str);
            if (bundle2.isEmpty()) {
                c3850a.f18082f = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
    }

    /* renamed from: c */
    public int m5778c(int i7) {
        C3783a c3783a = (C3783a) this.f17917b;
        int[] iArr = (int[]) this.f17918c;
        if (i7 == 0) {
            return m5779d(0);
        }
        if (i7 == 1) {
            int i8 = 0;
            for (int i9 : iArr) {
                i8 = c3783a.m5790a(i8, i9);
            }
            return i8;
        }
        int i10 = iArr[0];
        int length = iArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            i10 = c3783a.m5790a(c3783a.m5792c(i7, i10), iArr[i11]);
        }
        return i10;
    }

    /* renamed from: d */
    public int m5779d(int i7) {
        return ((int[]) this.f17918c)[(r0.length - 1) - i7];
    }

    /* renamed from: e */
    public int m5780e() {
        return ((int[]) this.f17918c).length - 1;
    }

    /* renamed from: f */
    public boolean m5781f() {
        if (((int[]) this.f17918c)[0] != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public C3781e m5782g(int i7) {
        int[] iArr = (int[]) this.f17918c;
        C3783a c3783a = (C3783a) this.f17917b;
        if (i7 == 0) {
            return c3783a.f17922c;
        }
        if (i7 == 1) {
            return this;
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr2[i8] = c3783a.m5792c(iArr[i8], i7);
        }
        return new C3781e(c3783a, iArr2);
    }

    /* renamed from: h */
    public C3781e m5783h(C3781e c3781e) {
        C3783a c3783a = (C3783a) this.f17917b;
        if (c3783a.equals((C3783a) c3781e.f17917b)) {
            if (!m5781f() && !c3781e.m5781f()) {
                int[] iArr = (int[]) this.f17918c;
                int length = iArr.length;
                int[] iArr2 = (int[]) c3781e.f17918c;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i7 = 0; i7 < length; i7++) {
                    int i8 = iArr[i7];
                    for (int i9 = 0; i9 < length2; i9++) {
                        int i10 = i7 + i9;
                        iArr3[i10] = c3783a.m5790a(iArr3[i10], c3783a.m5792c(i8, iArr2[i9]));
                    }
                }
                return new C3781e(c3783a, iArr3);
            }
            return c3783a.f17922c;
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x011b, code lost:
    
        if (r4 <= r3.f18164f) goto L90;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m5784i(C3006i c3006i, C2598d0 c2598d0) {
        String str;
        C3002e c3002e = c2598d0.f14068q;
        try {
            ((C3887f) this.f17917b).m5900a(c2598d0, c3002e);
            C3008k m4673b = c3002e.m4673b();
            C2617r c2617r = c2598d0.f14061j;
            int size = c2617r.size();
            int i7 = 0;
            int i8 = 0;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            Integer num = null;
            Integer num2 = null;
            while (i8 < size) {
                if (AbstractC0451r.m966H(c2617r.m4165b(i8), "Sec-WebSocket-Extensions")) {
                    String m4167d = c2617r.m4167d(i8);
                    int i9 = i7;
                    while (i9 < m4167d.length()) {
                        C2617r c2617r2 = c2617r;
                        int m4362h = AbstractC2721b.m4362h(m4167d, ',', i9, i7, 4);
                        int m4361g = AbstractC2721b.m4361g(m4167d, ';', i9, m4362h);
                        String m4380z = AbstractC2721b.m4380z(i9, m4361g, m4167d);
                        int i10 = m4361g + 1;
                        if (m4380z.equalsIgnoreCase("permessage-deflate")) {
                            if (z7) {
                                z10 = true;
                            }
                            while (true) {
                                i9 = i10;
                                while (i9 < m4362h) {
                                    int m4361g2 = AbstractC2721b.m4361g(m4167d, ';', i9, m4362h);
                                    int m4361g3 = AbstractC2721b.m4361g(m4167d, '=', i9, m4361g2);
                                    String m4380z2 = AbstractC2721b.m4380z(i9, m4361g3, m4167d);
                                    if (m4361g3 < m4361g2) {
                                        str = AbstractC0444k.m945i0(AbstractC2721b.m4380z(m4361g3 + 1, m4361g2, m4167d), "\"", "\"");
                                    } else {
                                        str = null;
                                    }
                                    i10 = m4361g2 + 1;
                                    if (m4380z2.equalsIgnoreCase("client_max_window_bits")) {
                                        if (num != null) {
                                            z10 = true;
                                        }
                                        if (str != null) {
                                            num = AbstractC0451r.m973O(str);
                                        } else {
                                            num = null;
                                        }
                                        if (num != null) {
                                            break;
                                        }
                                        i9 = i10;
                                        z10 = true;
                                    } else if (m4380z2.equalsIgnoreCase("client_no_context_takeover")) {
                                        if (z8) {
                                            z10 = true;
                                        }
                                        if (str != null) {
                                            z10 = true;
                                        }
                                        i9 = i10;
                                        z8 = true;
                                    } else {
                                        if (m4380z2.equalsIgnoreCase("server_max_window_bits")) {
                                            if (num2 != null) {
                                                z10 = true;
                                            }
                                            if (str != null) {
                                                num2 = AbstractC0451r.m973O(str);
                                            } else {
                                                num2 = null;
                                            }
                                            if (num2 != null) {
                                                break;
                                            }
                                        } else if (m4380z2.equalsIgnoreCase("server_no_context_takeover")) {
                                            if (z9) {
                                                z10 = true;
                                            }
                                            if (str != null) {
                                                z10 = true;
                                            }
                                            i9 = i10;
                                            z9 = true;
                                        }
                                        i9 = i10;
                                        z10 = true;
                                    }
                                }
                            }
                            z7 = true;
                        } else {
                            i9 = i10;
                            z10 = true;
                        }
                        c2617r = c2617r2;
                        i7 = 0;
                    }
                }
                i8++;
                c2617r = c2617r;
                i7 = 0;
            }
            ((C3887f) this.f17917b).f18193d = new C3888g(z7, num, z8, num2, z9, z10);
            try {
                if (!z10 && num == null) {
                    if (num2 != null) {
                        C3877b c3877b = new C3877b(8, 15, 1);
                        int intValue = num2.intValue();
                        if (8 <= intValue) {
                        }
                    }
                    ((C3887f) this.f17917b).m5903d(AbstractC2721b.f14575g + " WebSocket " + ((C2592a0) this.f17918c).f14018a.m4176f(), m4673b);
                    C3887f c3887f = (C3887f) this.f17917b;
                    c3887f.f18190a.mo2371n(c3887f, c2598d0);
                    ((C3887f) this.f17917b).m5904e();
                    return;
                }
                ((C3887f) this.f17917b).m5903d(AbstractC2721b.f14575g + " WebSocket " + ((C2592a0) this.f17918c).f14018a.m4176f(), m4673b);
                C3887f c3887f2 = (C3887f) this.f17917b;
                c3887f2.f18190a.mo2371n(c3887f2, c2598d0);
                ((C3887f) this.f17917b).m5904e();
                return;
            } catch (Exception e7) {
                ((C3887f) this.f17917b).m5902c(e7, null);
                return;
            }
            C3887f c3887f3 = (C3887f) this.f17917b;
            synchronized (c3887f3) {
                c3887f3.f18204o.clear();
                c3887f3.m5901b("unexpected Sec-WebSocket-Extensions in response header", 1010);
            }
        } catch (IOException e8) {
            ((C3887f) this.f17917b).m5902c(e8, c2598d0);
            AbstractC2721b.m4358d(c2598d0);
            if (c3002e != null) {
                c3002e.m4672a(true, true, null);
            }
        }
    }

    /* renamed from: j */
    public void m5785j(Bundle bundle) {
        C3850a c3850a = (C3850a) this.f17917b;
        InterfaceC3782f interfaceC3782f = c3850a.f18077a;
        if (!c3850a.f18081e) {
            c3850a.m5867a();
        }
        if (interfaceC3782f.mo415g().f881c.compareTo(EnumC0203o.f866h) < 0) {
            if (!c3850a.f18083g) {
                Bundle bundle2 = null;
                if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                    bundle2 = AbstractC2067b.m3292q("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
                }
                c3850a.f18082f = bundle2;
                c3850a.f18083g = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + interfaceC3782f.mo415g().f881c).toString());
    }

    /* renamed from: k */
    public void m5786k(Bundle bundle) {
        C3850a c3850a = (C3850a) this.f17917b;
        Bundle m5138i = AbstractC3393k.m5138i((C1687f[]) Arrays.copyOf(new C1687f[0], 0));
        Bundle bundle2 = c3850a.f18082f;
        if (bundle2 != null) {
            m5138i.putAll(bundle2);
        }
        synchronized (c3850a.f18079c) {
            for (Map.Entry entry : c3850a.f18080d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle mo462a = ((InterfaceC3780d) entry.getValue()).mo462a();
                AbstractC3367j.m5100e(str, "key");
                m5138i.putBundle(str, mo462a);
            }
        }
        if (!m5138i.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", m5138i);
        }
    }

    /* renamed from: l */
    public void m5787l(String str, InterfaceC3780d interfaceC3780d) {
        AbstractC3367j.m5100e(interfaceC3780d, "provider");
        C3850a c3850a = (C3850a) this.f17917b;
        synchronized (c3850a.f18079c) {
            if (!c3850a.f18080d.containsKey(str)) {
                c3850a.f18080d.put(str, interfaceC3780d);
            } else {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }
    }

    /* renamed from: m */
    public void m5788m() {
        if (((C3850a) this.f17917b).f18084h) {
            C3777a c3777a = (C3777a) this.f17918c;
            if (c3777a == null) {
                c3777a = new C3777a(this);
            }
            this.f17918c = c3777a;
            try {
                C0195k.class.getDeclaredConstructor(null);
                C3777a c3777a2 = (C3777a) this.f17918c;
                if (c3777a2 != null) {
                    c3777a2.f17913a.add(C0195k.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e7) {
                throw new IllegalArgumentException("Class " + C0195k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    /* renamed from: n */
    public C3781e m5789n(C3781e c3781e) {
        if (((C3783a) this.f17917b).equals((C3783a) c3781e.f17917b)) {
            if (c3781e.m5781f()) {
                return this;
            }
            C3783a c3783a = (C3783a) c3781e.f17917b;
            int[] iArr = (int[]) c3781e.f17918c;
            int length = iArr.length;
            int[] iArr2 = new int[length];
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                c3783a.getClass();
                iArr2[i7] = (929 - i8) % 929;
            }
            return m5776a(new C3781e(c3783a, iArr2));
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        switch (this.f17916a) {
            case 2:
                StringBuilder sb = new StringBuilder(m5780e() * 8);
                for (int m5780e = m5780e(); m5780e >= 0; m5780e--) {
                    int m5779d = m5779d(m5780e);
                    if (m5779d != 0) {
                        if (m5779d < 0) {
                            sb.append(" - ");
                            m5779d = -m5779d;
                        } else if (sb.length() > 0) {
                            sb.append(" + ");
                        }
                        if (m5780e == 0 || m5779d != 1) {
                            sb.append(m5779d);
                        }
                        if (m5780e != 0) {
                            if (m5780e == 1) {
                                sb.append('x');
                            } else {
                                sb.append("x^");
                                sb.append(m5780e);
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C3781e(C3783a c3783a, int[] iArr) {
        this.f17916a = 2;
        if (iArr.length != 0) {
            this.f17917b = c3783a;
            int length = iArr.length;
            int i7 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i7 < length && iArr[i7] == 0) {
                    i7++;
                }
                if (i7 == length) {
                    this.f17918c = new int[]{0};
                    return;
                }
                int i8 = length - i7;
                int[] iArr2 = new int[i8];
                this.f17918c = iArr2;
                System.arraycopy(iArr, i7, iArr2, 0, i8);
                return;
            }
            this.f17918c = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public C3781e(C3887f c3887f, C2592a0 c2592a0) {
        this.f17916a = 3;
        this.f17917b = c3887f;
        this.f17918c = c2592a0;
    }
}
