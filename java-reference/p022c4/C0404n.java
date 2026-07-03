package p022c4;

import java.util.EnumMap;
import java.util.Map;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c4.n */
/* loaded from: classes.dex */
public final class C0404n {

    /* renamed from: a */
    public final String f1371a;

    /* renamed from: b */
    public final byte[] f1372b;

    /* renamed from: c */
    public C0406p[] f1373c;

    /* renamed from: d */
    public final EnumC0391a f1374d;

    /* renamed from: e */
    public Map f1375e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0404n(String str, byte[] bArr, C0406p[] c0406pArr, EnumC0391a enumC0391a) {
        this(str, bArr, c0406pArr, enumC0391a, 0);
        System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void m879a(Map map) {
        if (map != null) {
            Map map2 = this.f1375e;
            if (map2 == null) {
                this.f1375e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: b */
    public final void m880b(EnumC0405o enumC0405o, Object obj) {
        if (this.f1375e == null) {
            this.f1375e = new EnumMap(EnumC0405o.class);
        }
        this.f1375e.put(enumC0405o, obj);
    }

    public final String toString() {
        return this.f1371a;
    }

    public C0404n(String str, byte[] bArr, C0406p[] c0406pArr, EnumC0391a enumC0391a, int i7) {
        this.f1371a = str;
        this.f1372b = bArr;
        this.f1373c = c0406pArr;
        this.f1374d = enumC0391a;
        this.f1375e = null;
    }
}
