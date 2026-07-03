package p039e5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p060h5.C1803k;
import p060h5.C1813u;
import p073j2.AbstractC2168e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.a */
/* loaded from: classes.dex */
public final class C0694a {

    /* renamed from: g */
    public double f2265g;

    /* renamed from: h */
    public double f2266h;

    /* renamed from: j */
    public volatile double f2268j;

    /* renamed from: k */
    public volatile double f2269k;

    /* renamed from: a */
    public final Object f2259a = new Object();

    /* renamed from: b */
    public final C1803k f2260b = new C1803k();

    /* renamed from: c */
    public final C1803k f2261c = new C1803k();

    /* renamed from: d */
    public final C1803k f2262d = new C1803k();

    /* renamed from: e */
    public final C1803k f2263e = new C1803k();

    /* renamed from: f */
    public final C1803k f2264f = new C1803k();

    /* renamed from: i */
    public int f2267i = AbstractC2168e.m3530q(4, 2, 8);

    /* renamed from: a */
    public static double m1483a(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            int i7 = 0;
            double d7 = 0.0d;
            while (it.hasNext()) {
                d7 += ((Number) it.next()).doubleValue();
                i7++;
            }
            if (i7 != 0) {
                return d7 / i7;
            }
        }
        return 0.0d;
    }

    /* renamed from: d */
    public static List m1484d(C1803k c1803k) {
        if (c1803k.isEmpty()) {
            return C1813u.f10860e;
        }
        ArrayList arrayList = new ArrayList(c1803k.f10858g);
        Iterator<E> it = c1803k.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Number) it.next()).doubleValue()));
        }
        int size = arrayList.size() - 3;
        if (size < 0) {
            size = 0;
        }
        List subList = arrayList.subList(size, arrayList.size());
        AbstractC3367j.m5099d(subList, "subList(...)");
        return subList;
    }

    /* renamed from: e */
    public static List m1485e(C1803k c1803k) {
        if (c1803k.isEmpty()) {
            return C1813u.f10860e;
        }
        ArrayList arrayList = new ArrayList(c1803k.f10858g);
        Iterator<E> it = c1803k.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) it.next()).intValue()));
        }
        int size = arrayList.size() - 3;
        if (size < 0) {
            size = 0;
        }
        List subList = arrayList.subList(size, arrayList.size());
        AbstractC3367j.m5099d(subList, "subList(...)");
        return subList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c2, code lost:
    
        if (r0 > 8) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ed A[Catch: all -> 0x0067, LOOP:5: B:41:0x00e7->B:43:0x00ed, LOOP_END, TryCatch #0 {all -> 0x0067, blocks: (B:4:0x0005, B:7:0x0011, B:10:0x0033, B:13:0x0044, B:16:0x0055, B:17:0x005c, B:19:0x0063, B:21:0x006a, B:23:0x0070, B:25:0x0074, B:27:0x007a, B:29:0x007e, B:31:0x0084, B:33:0x0088, B:35:0x008e, B:37:0x0092, B:40:0x00d2, B:41:0x00e7, B:43:0x00ed, B:45:0x00f9, B:47:0x0115, B:51:0x0136, B:52:0x013b, B:54:0x0146, B:66:0x01ab, B:69:0x01d0, B:72:0x01d9, B:80:0x01b5, B:85:0x01bf, B:89:0x01c8, B:92:0x01ce, B:110:0x016d, B:121:0x0124, B:123:0x00a1, B:124:0x00a8, B:126:0x00ae, B:130:0x00bf, B:132:0x00c8, B:137:0x00d0), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:4:0x0005, B:7:0x0011, B:10:0x0033, B:13:0x0044, B:16:0x0055, B:17:0x005c, B:19:0x0063, B:21:0x006a, B:23:0x0070, B:25:0x0074, B:27:0x007a, B:29:0x007e, B:31:0x0084, B:33:0x0088, B:35:0x008e, B:37:0x0092, B:40:0x00d2, B:41:0x00e7, B:43:0x00ed, B:45:0x00f9, B:47:0x0115, B:51:0x0136, B:52:0x013b, B:54:0x0146, B:66:0x01ab, B:69:0x01d0, B:72:0x01d9, B:80:0x01b5, B:85:0x01bf, B:89:0x01c8, B:92:0x01ce, B:110:0x016d, B:121:0x0124, B:123:0x00a1, B:124:0x00a8, B:126:0x00ae, B:130:0x00bf, B:132:0x00c8, B:137:0x00d0), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:4:0x0005, B:7:0x0011, B:10:0x0033, B:13:0x0044, B:16:0x0055, B:17:0x005c, B:19:0x0063, B:21:0x006a, B:23:0x0070, B:25:0x0074, B:27:0x007a, B:29:0x007e, B:31:0x0084, B:33:0x0088, B:35:0x008e, B:37:0x0092, B:40:0x00d2, B:41:0x00e7, B:43:0x00ed, B:45:0x00f9, B:47:0x0115, B:51:0x0136, B:52:0x013b, B:54:0x0146, B:66:0x01ab, B:69:0x01d0, B:72:0x01d9, B:80:0x01b5, B:85:0x01bf, B:89:0x01c8, B:92:0x01ce, B:110:0x016d, B:121:0x0124, B:123:0x00a1, B:124:0x00a8, B:126:0x00ae, B:130:0x00bf, B:132:0x00c8, B:137:0x00d0), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ab A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:4:0x0005, B:7:0x0011, B:10:0x0033, B:13:0x0044, B:16:0x0055, B:17:0x005c, B:19:0x0063, B:21:0x006a, B:23:0x0070, B:25:0x0074, B:27:0x007a, B:29:0x007e, B:31:0x0084, B:33:0x0088, B:35:0x008e, B:37:0x0092, B:40:0x00d2, B:41:0x00e7, B:43:0x00ed, B:45:0x00f9, B:47:0x0115, B:51:0x0136, B:52:0x013b, B:54:0x0146, B:66:0x01ab, B:69:0x01d0, B:72:0x01d9, B:80:0x01b5, B:85:0x01bf, B:89:0x01c8, B:92:0x01ce, B:110:0x016d, B:121:0x0124, B:123:0x00a1, B:124:0x00a8, B:126:0x00ae, B:130:0x00bf, B:132:0x00c8, B:137:0x00d0), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b3  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1486b(double d7, double d8, int i7, double d9, double d10, boolean z7, boolean z8) {
        double d11;
        int i8;
        double d12;
        double d13;
        double d14;
        double m1483a;
        Iterator it;
        double m1483a2;
        double d15;
        double d16;
        char c7;
        char c8;
        int i9;
        double d17;
        double d18;
        synchronized (this.f2259a) {
            try {
                C1803k c1803k = this.f2260b;
                if (d7 < 0.0d) {
                    d11 = 0.0d;
                } else {
                    d11 = d7;
                }
                c1803k.addLast(Double.valueOf(d11));
                this.f2261c.addLast(Double.valueOf(AbstractC2168e.m3528o(d8, 0.0d, 1.0d)));
                C1803k c1803k2 = this.f2262d;
                if (i7 < 0) {
                    i8 = 0;
                } else {
                    i8 = i7;
                }
                c1803k2.addLast(Integer.valueOf(i8));
                C1803k c1803k3 = this.f2263e;
                if (d9 < 0.0d) {
                    d12 = 0.0d;
                } else {
                    d12 = d9;
                }
                c1803k3.addLast(Double.valueOf(d12));
                C1803k c1803k4 = this.f2264f;
                if (d10 < 0.0d) {
                    d13 = 0.0d;
                } else {
                    d13 = d10;
                }
                c1803k4.addLast(Double.valueOf(d13));
                while (true) {
                    C1803k c1803k5 = this.f2260b;
                    if (c1803k5.f10858g <= 6) {
                        break;
                    } else {
                        c1803k5.removeFirst();
                    }
                }
                while (true) {
                    C1803k c1803k6 = this.f2261c;
                    if (c1803k6.f10858g <= 6) {
                        break;
                    } else {
                        c1803k6.removeFirst();
                    }
                }
                while (true) {
                    C1803k c1803k7 = this.f2262d;
                    if (c1803k7.f10858g <= 6) {
                        break;
                    } else {
                        c1803k7.removeFirst();
                    }
                }
                while (true) {
                    C1803k c1803k8 = this.f2263e;
                    if (c1803k8.f10858g <= 6) {
                        break;
                    } else {
                        c1803k8.removeFirst();
                    }
                }
                while (true) {
                    C1803k c1803k9 = this.f2264f;
                    if (c1803k9.f10858g <= 6) {
                        break;
                    } else {
                        c1803k9.removeFirst();
                    }
                }
                List m1484d = m1484d(this.f2260b);
                if (m1484d.size() >= 3) {
                    Iterator it2 = m1484d.iterator();
                    Double d19 = null;
                    double d20 = 0.0d;
                    int i10 = 0;
                    while (it2.hasNext()) {
                        double doubleValue = ((Number) it2.next()).doubleValue();
                        if (doubleValue < 0.0d) {
                            doubleValue = 0.0d;
                        }
                        if (d19 != null) {
                            d20 += doubleValue - d19.doubleValue();
                            i10++;
                        }
                        d19 = Double.valueOf(doubleValue);
                    }
                    if (i10 != 0) {
                        d14 = d20 / i10;
                        m1483a = m1483a(m1484d(this.f2261c));
                        it = m1485e(this.f2262d).iterator();
                        int i11 = 0;
                        while (it.hasNext()) {
                            i11 += ((Number) it.next()).intValue();
                        }
                        m1483a2 = m1483a(m1484d(this.f2263e));
                        double m1483a3 = m1483a(m1484d(this.f2264f));
                        this.f2268j = m1483a2;
                        this.f2269k = m1483a;
                        if (m1483a2 <= 0.0d) {
                            d15 = 0.0d;
                            double d21 = this.f2266h;
                            if (d21 > 0.0d && m1483a2 >= d21) {
                                d18 = (0.02d * m1483a2) + (d21 * 0.98d);
                                this.f2266h = d18;
                            }
                            d18 = m1483a2;
                            this.f2266h = d18;
                        } else {
                            d15 = 0.0d;
                        }
                        d16 = this.f2266h;
                        double d22 = 450.0d;
                        if (d16 > d15) {
                            d22 = Math.max(450.0d, d16 * 3.0d);
                        }
                        int i12 = 2;
                        if (m1483a < 0.3d) {
                            c7 = 3;
                        } else {
                            if (m1483a < 0.12d && i11 < 2) {
                                if ((d14 >= d15 || this.f2265g <= d15) && m1483a2 <= d22 && m1483a3 <= 600.0d) {
                                    c7 = 0;
                                }
                                c7 = 1;
                            }
                            c7 = 2;
                        }
                        if (!z8 && d14 > d15 && m1483a < 0.05d) {
                            c8 = 2;
                        } else {
                            if ((z8 || d14 < d15 || m1483a >= 0.12d) && (!z7 || !z8)) {
                                c8 = 0;
                            }
                            c8 = 1;
                        }
                        if (c7 < 3) {
                            i9 = this.f2267i - 2;
                            if (i9 < 2) {
                                this.f2267i = i12;
                                if (d7 < 0.0d) {
                                    d17 = d15;
                                } else {
                                    d17 = d7;
                                }
                                this.f2265g = d17;
                            }
                            i12 = i9;
                            this.f2267i = i12;
                            if (d7 < 0.0d) {
                            }
                            this.f2265g = d17;
                        } else if (c7 >= 1) {
                            i9 = this.f2267i - 1;
                            if (i9 < 2) {
                                this.f2267i = i12;
                                if (d7 < 0.0d) {
                                }
                                this.f2265g = d17;
                            }
                            i12 = i9;
                            this.f2267i = i12;
                            if (d7 < 0.0d) {
                            }
                            this.f2265g = d17;
                        } else {
                            if (c8 >= 2) {
                                i9 = this.f2267i + 1;
                            } else if (c8 >= 1) {
                                i9 = this.f2267i + 1;
                                if (i9 > 8) {
                                    i12 = 8;
                                }
                                i12 = i9;
                            } else {
                                i12 = this.f2267i;
                            }
                            this.f2267i = i12;
                            if (d7 < 0.0d) {
                            }
                            this.f2265g = d17;
                        }
                    }
                }
                d14 = 0.0d;
                m1483a = m1483a(m1484d(this.f2261c));
                it = m1485e(this.f2262d).iterator();
                int i112 = 0;
                while (it.hasNext()) {
                }
                m1483a2 = m1483a(m1484d(this.f2263e));
                double m1483a32 = m1483a(m1484d(this.f2264f));
                this.f2268j = m1483a2;
                this.f2269k = m1483a;
                if (m1483a2 <= 0.0d) {
                }
                d16 = this.f2266h;
                double d222 = 450.0d;
                if (d16 > d15) {
                }
                int i122 = 2;
                if (m1483a < 0.3d) {
                }
                if (!z8) {
                }
                if (z8) {
                }
                c8 = 0;
                if (c7 < 3) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void m1487c() {
        synchronized (this.f2259a) {
            this.f2260b.clear();
            this.f2261c.clear();
            this.f2262d.clear();
            this.f2263e.clear();
            this.f2264f.clear();
            this.f2267i = AbstractC2168e.m3530q(this.f2267i, 2, 8);
            this.f2268j = 0.0d;
            this.f2269k = 0.0d;
            this.f2265g = 0.0d;
            this.f2266h = 0.0d;
        }
    }
}
