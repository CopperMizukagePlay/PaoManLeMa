package p153u0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p001a0.C0031h1;
import p060h5.AbstractC1806n;
import p060h5.C1814v;
import p077k.AbstractC2210p0;
import p077k.C2194h0;
import p102n1.AbstractC2710c;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u0.f */
/* loaded from: classes.dex */
public final class C3339f implements InterfaceC3338e {

    /* renamed from: e */
    public final InterfaceC3279c f16397e;

    /* renamed from: f */
    public final C2194h0 f16398f;

    /* renamed from: g */
    public C2194h0 f16399g;

    public C3339f(Map map, InterfaceC3279c interfaceC3279c) {
        C2194h0 c2194h0;
        this.f16397e = interfaceC3279c;
        if (map != null && !map.isEmpty()) {
            c2194h0 = new C2194h0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                c2194h0.m3598m(entry.getKey(), entry.getValue());
            }
        } else {
            c2194h0 = null;
        }
        this.f16398f = c2194h0;
    }

    @Override // p153u0.InterfaceC3338e
    /* renamed from: c */
    public final boolean mo5074c(Object obj) {
        return ((Boolean) this.f16397e.mo23f(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // p153u0.InterfaceC3338e
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map mo5075d() {
        int i7;
        int i8;
        char c7;
        long j6;
        long j7;
        long j8;
        C2194h0 c2194h0;
        long[] jArr;
        int i9;
        long[] jArr2;
        int i10;
        char c8;
        long j9;
        C2194h0 c2194h02 = this.f16398f;
        if (c2194h02 == null && this.f16399g == null) {
            return C1814v.f10861e;
        }
        int i11 = 0;
        if (c2194h02 != null) {
            i7 = c2194h02.f12680e;
        } else {
            i7 = 0;
        }
        C2194h0 c2194h03 = this.f16399g;
        if (c2194h03 != null) {
            i8 = c2194h03.f12680e;
        } else {
            i8 = 0;
        }
        HashMap hashMap = new HashMap(i7 + i8);
        char c9 = 7;
        long j10 = -9187201950435737472L;
        int i12 = 8;
        if (c2194h02 != null) {
            Object[] objArr = c2194h02.f12677b;
            Object[] objArr2 = c2194h02.f12678c;
            long[] jArr3 = c2194h02.f12676a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i13 = 0;
                j7 = 128;
                while (true) {
                    long j11 = jArr3[i13];
                    j8 = 255;
                    if ((((~j11) << c9) & j11 & j10) != j10) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j11 & 255) < 128) {
                                int i16 = (i13 << 3) + i15;
                                c8 = c9;
                                j9 = j10;
                                hashMap.put((String) objArr[i16], (List) objArr2[i16]);
                            } else {
                                c8 = c9;
                                j9 = j10;
                            }
                            j11 >>= 8;
                            i15++;
                            c9 = c8;
                            j10 = j9;
                        }
                        c7 = c9;
                        j6 = j10;
                        if (i14 != 8) {
                            break;
                        }
                    } else {
                        c7 = c9;
                        j6 = j10;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                    c9 = c7;
                    j10 = j6;
                }
                c2194h0 = this.f16399g;
                if (c2194h0 != null) {
                    Object[] objArr3 = c2194h0.f12677b;
                    Object[] objArr4 = c2194h0.f12678c;
                    long[] jArr4 = c2194h0.f12676a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i17 = 0;
                        while (true) {
                            long j12 = jArr4[i17];
                            if ((((~j12) << c7) & j12 & j6) != j6) {
                                int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                int i19 = i11;
                                while (i19 < i18) {
                                    if ((j12 & j8) < j7) {
                                        int i20 = (i17 << 3) + i19;
                                        Object obj = objArr3[i20];
                                        List list = (List) objArr4[i20];
                                        String str = (String) obj;
                                        i10 = i12;
                                        if (list.size() == 1) {
                                            Object mo52a = ((InterfaceC3277a) list.get(i11)).mo52a();
                                            if (mo52a != null) {
                                                if (mo5074c(mo52a)) {
                                                    hashMap.put(str, AbstractC1806n.m3063K(mo52a));
                                                } else {
                                                    throw new IllegalStateException(AbstractC3344k.m5078a(mo52a).toString());
                                                }
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i11 < size) {
                                                long[] jArr5 = jArr4;
                                                Object mo52a2 = ((InterfaceC3277a) list.get(i11)).mo52a();
                                                if (mo52a2 != null && !mo5074c(mo52a2)) {
                                                    throw new IllegalStateException(AbstractC3344k.m5078a(mo52a2).toString());
                                                }
                                                arrayList.add(mo52a2);
                                                i11++;
                                                jArr4 = jArr5;
                                            }
                                            jArr2 = jArr4;
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        i10 = i12;
                                    }
                                    j12 >>= i10;
                                    i19++;
                                    i12 = i10;
                                    jArr4 = jArr2;
                                    i11 = 0;
                                }
                                jArr = jArr4;
                                i9 = i12;
                                if (i18 != i9) {
                                    break;
                                }
                            } else {
                                jArr = jArr4;
                                i9 = i12;
                            }
                            if (i17 == length2) {
                                break;
                            }
                            i17++;
                            i12 = i9;
                            jArr4 = jArr;
                            i11 = 0;
                        }
                    }
                }
                return hashMap;
            }
        }
        c7 = 7;
        j6 = -9187201950435737472L;
        j7 = 128;
        j8 = 255;
        c2194h0 = this.f16399g;
        if (c2194h0 != null) {
        }
        return hashMap;
    }

    @Override // p153u0.InterfaceC3338e
    /* renamed from: e */
    public final Object mo5076e(String str) {
        List list;
        C2194h0 c2194h0 = this.f16398f;
        if (c2194h0 != null) {
            list = (List) c2194h0.m3596k(str);
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && c2194h0 != null) {
            List subList = list.subList(1, list.size());
            int m3591f = c2194h0.m3591f(str);
            if (m3591f < 0) {
                m3591f = ~m3591f;
            }
            Object[] objArr = c2194h0.f12678c;
            Object obj = objArr[m3591f];
            c2194h0.f12677b[m3591f] = str;
            objArr[m3591f] = subList;
        }
        return list.get(0);
    }

    @Override // p153u0.InterfaceC3338e
    /* renamed from: f */
    public final InterfaceC3337d mo5077f(String str, InterfaceC3277a interfaceC3277a) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!AbstractC2710c.m4323F(str.charAt(i7))) {
                C2194h0 c2194h0 = this.f16399g;
                if (c2194h0 == null) {
                    long[] jArr = AbstractC2210p0.f12722a;
                    c2194h0 = new C2194h0();
                    this.f16399g = c2194h0;
                }
                Object m3592g = c2194h0.m3592g(str);
                if (m3592g == null) {
                    m3592g = new ArrayList();
                    c2194h0.m3598m(str, m3592g);
                }
                ((List) m3592g).add(interfaceC3277a);
                return new C0031h1(c2194h0, str, interfaceC3277a, 12);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
