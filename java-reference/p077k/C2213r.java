package p077k;

import androidx.lifecycle.C0212s0;
import java.util.Map;
import java.util.Set;
import p006a7.C0129l;
import p060h5.AbstractC1805m;
import p084l.AbstractC2334a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.r */
/* loaded from: classes.dex */
public final class C2213r {

    /* renamed from: a */
    public final int f12727a;

    /* renamed from: b */
    public final C0212s0 f12728b;

    /* renamed from: c */
    public final C0129l f12729c;

    /* renamed from: d */
    public int f12730d;

    /* renamed from: e */
    public int f12731e;

    /* renamed from: f */
    public int f12732f;

    public C2213r(int i7) {
        this.f12727a = i7;
        if (i7 > 0) {
            this.f12728b = new C0212s0(1);
            this.f12729c = new C0129l(20);
        } else {
            AbstractC2334a.m3712c("maxSize <= 0");
            throw null;
        }
    }

    /* renamed from: a */
    public final Object m3623a(Object obj) {
        AbstractC3367j.m5100e(obj, "key");
        synchronized (this.f12729c) {
            C0212s0 c0212s0 = this.f12728b;
            c0212s0.getClass();
            Object obj2 = c0212s0.f876a.get(obj);
            if (obj2 != null) {
                this.f12731e++;
                return obj2;
            }
            this.f12732f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        return r6;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3624b(Object obj, Object obj2) {
        Object put;
        AbstractC3367j.m5100e(obj, "key");
        synchronized (this.f12729c) {
            this.f12730d++;
            C0212s0 c0212s0 = this.f12728b;
            c0212s0.getClass();
            put = c0212s0.f876a.put(obj, obj2);
            if (put != null) {
                this.f12730d--;
            }
        }
        int i7 = this.f12727a;
        while (true) {
            synchronized (this.f12729c) {
                try {
                    if (this.f12730d < 0 || (this.f12728b.f876a.isEmpty() && this.f12730d != 0)) {
                        break;
                    }
                    if (this.f12730d <= i7 || this.f12728b.f876a.isEmpty()) {
                        break;
                    }
                    Set entrySet = this.f12728b.f876a.entrySet();
                    AbstractC3367j.m5099d(entrySet, "<get-entries>(...)");
                    Map.Entry entry = (Map.Entry) AbstractC1805m.m3046j0(entrySet);
                    if (entry == null) {
                        return put;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    C0212s0 c0212s02 = this.f12728b;
                    c0212s02.getClass();
                    AbstractC3367j.m5100e(key, "key");
                    c0212s02.f876a.remove(key);
                    int i8 = this.f12730d;
                    AbstractC3367j.m5100e(value, "value");
                    this.f12730d = i8 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        int i7;
        String str;
        synchronized (this.f12729c) {
            try {
                int i8 = this.f12731e;
                int i9 = this.f12732f + i8;
                if (i9 != 0) {
                    i7 = (i8 * 100) / i9;
                } else {
                    i7 = 0;
                }
                str = "LruCache[maxSize=" + this.f12727a + ",hits=" + this.f12731e + ",misses=" + this.f12732f + ",hitRate=" + i7 + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
