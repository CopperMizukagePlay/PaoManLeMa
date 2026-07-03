package p067i4;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;
import p024c6.C0442i;
import p037e3.C0691e;
import p060h5.AbstractC1811s;
import p079k1.C2258a;
import p099m6.AbstractC2614o;
import p099m6.C2591a;
import p099m6.C2604g0;
import p099m6.C2619t;
import p100n.C2673p1;
import p106n6.AbstractC2721b;
import p121p6.C2883b;
import p121p6.C2884c;
import p128q6.C3006i;
import p128q6.C3009l;
import p128q6.C3011n;
import p151t6.C3285a;
import p151t6.C3288b0;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i4.d */
/* loaded from: classes.dex */
public final class C2071d {

    /* renamed from: a */
    public int f12267a;

    /* renamed from: b */
    public int f12268b;

    /* renamed from: c */
    public int f12269c;

    /* renamed from: d */
    public final Object f12270d;

    /* renamed from: e */
    public final Object f12271e;

    /* renamed from: f */
    public final Object f12272f;

    /* renamed from: g */
    public final Object f12273g;

    /* renamed from: h */
    public Object f12274h;

    /* renamed from: i */
    public Object f12275i;

    /* renamed from: j */
    public Object f12276j;

    public C2071d(String str, String str2, byte[] bArr) {
        this(bArr, str, null, str2, -1, -1, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x030e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.List, java.lang.Object] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3009l m3322a(int i7, int i8, int i9, int i10, boolean z7, boolean z8) {
        ArrayList arrayList;
        String str;
        int i11;
        List list;
        boolean contains;
        C2673p1 c2673p1;
        boolean z9;
        boolean z10;
        Socket m4686j;
        while (!((C3006i) this.f12272f).f15509t) {
            C3009l c3009l = ((C3006i) this.f12272f).f15503n;
            boolean z11 = true;
            if (c3009l != null) {
                synchronized (c3009l) {
                    try {
                        if (!c3009l.f15524j && m3323b(c3009l.f15516b.f14094a.f14015h)) {
                            m4686j = null;
                        }
                        m4686j = ((C3006i) this.f12272f).m4686j();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (((C3006i) this.f12272f).f15503n != null) {
                    if (m4686j != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    z9 = z8;
                    if (c3009l.m4695i(z9)) {
                        return c3009l;
                    }
                    c3009l.m4697k();
                    if (((C2604g0) this.f12276j) == null) {
                        C0691e c0691e = (C0691e) this.f12274h;
                        if (c0691e != null) {
                            z10 = c0691e.m1479d();
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            continue;
                        } else {
                            C3011n c3011n = (C3011n) this.f12275i;
                            if (c3011n != null) {
                                z11 = c3011n.m4707i();
                            }
                            if (!z11) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (m4686j != null) {
                        AbstractC2721b.m4359e(m4686j);
                    }
                    ((AbstractC2614o) this.f12273g).getClass();
                }
            }
            this.f12267a = 0;
            this.f12268b = 0;
            this.f12269c = 0;
            if (((C2258a) this.f12270d).m3664a((C2591a) this.f12271e, (C3006i) this.f12272f, null, false)) {
                c3009l = ((C3006i) this.f12272f).f15503n;
                AbstractC3367j.m5097b(c3009l);
                ((AbstractC2614o) this.f12273g).mo2422a((C3006i) this.f12272f, c3009l);
            } else {
                C2604g0 c2604g0 = (C2604g0) this.f12276j;
                try {
                    if (c2604g0 != null) {
                        this.f12276j = null;
                    } else {
                        C0691e c0691e2 = (C0691e) this.f12274h;
                        if (c0691e2 != null && c0691e2.m1479d()) {
                            C0691e c0691e3 = (C0691e) this.f12274h;
                            AbstractC3367j.m5097b(c0691e3);
                            if (c0691e3.m1479d()) {
                                ArrayList arrayList2 = (ArrayList) c0691e3.f2245b;
                                int i12 = c0691e3.f2244a;
                                c0691e3.f2244a = i12 + 1;
                                c2604g0 = (C2604g0) arrayList2.get(i12);
                            } else {
                                throw new NoSuchElementException();
                            }
                        } else {
                            C3011n c3011n2 = (C3011n) this.f12275i;
                            if (c3011n2 == null) {
                                C2591a c2591a = (C2591a) this.f12271e;
                                C3006i c3006i = (C3006i) this.f12272f;
                                c3011n2 = new C3011n(c2591a, c3006i.f15494e.f14199F, c3006i, (AbstractC2614o) this.f12273g);
                                this.f12275i = c3011n2;
                            }
                            if (c3011n2.m4707i()) {
                                arrayList = new ArrayList();
                                while (c3011n2.f15534a < ((List) c3011n2.f15538e).size()) {
                                    C2591a c2591a2 = (C2591a) c3011n2.f15535b;
                                    if (c3011n2.f15534a < ((List) c3011n2.f15538e).size()) {
                                        List list2 = (List) c3011n2.f15538e;
                                        int i13 = c3011n2.f15534a;
                                        c3011n2.f15534a = i13 + 1;
                                        Proxy proxy = (Proxy) list2.get(i13);
                                        AbstractC2614o abstractC2614o = (AbstractC2614o) c3011n2.f15537d;
                                        ArrayList arrayList3 = new ArrayList();
                                        c3011n2.f15539f = arrayList3;
                                        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
                                            SocketAddress address = proxy.address();
                                            if (address instanceof InetSocketAddress) {
                                                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                                InetAddress address2 = inetSocketAddress.getAddress();
                                                if (address2 == null) {
                                                    str = inetSocketAddress.getHostName();
                                                    AbstractC3367j.m5099d(str, "hostName");
                                                } else {
                                                    str = address2.getHostAddress();
                                                    AbstractC3367j.m5099d(str, "address.hostAddress");
                                                }
                                                i11 = inetSocketAddress.getPort();
                                            } else {
                                                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                            }
                                        } else {
                                            C2619t c2619t = c2591a2.f14015h;
                                            str = c2619t.f14154d;
                                            i11 = c2619t.f14155e;
                                        }
                                        if (1 <= i11 && i11 < 65536) {
                                            if (proxy.type() == Proxy.Type.SOCKS) {
                                                arrayList3.add(InetSocketAddress.createUnresolved(str, i11));
                                            } else {
                                                byte[] bArr = AbstractC2721b.f14569a;
                                                AbstractC3367j.m5100e(str, "<this>");
                                                C0442i c0442i = AbstractC2721b.f14574f;
                                                c0442i.getClass();
                                                if (c0442i.f1508e.matcher(str).matches()) {
                                                    list = AbstractC3784a.m5817z(InetAddress.getByName(str));
                                                } else {
                                                    abstractC2614o.getClass();
                                                    List mo34e = c2591a2.f14008a.mo34e(str);
                                                    if (!mo34e.isEmpty()) {
                                                        list = mo34e;
                                                    } else {
                                                        throw new UnknownHostException(c2591a2.f14008a + " returned no addresses for " + str);
                                                    }
                                                }
                                                Iterator it = list.iterator();
                                                while (it.hasNext()) {
                                                    arrayList3.add(new InetSocketAddress((InetAddress) it.next(), i11));
                                                }
                                            }
                                            Iterator it2 = c3011n2.f15539f.iterator();
                                            while (it2.hasNext()) {
                                                C2604g0 c2604g02 = new C2604g0((C2591a) c3011n2.f15535b, proxy, (InetSocketAddress) it2.next());
                                                C2673p1 c2673p12 = (C2673p1) c3011n2.f15536c;
                                                synchronized (c2673p12) {
                                                    contains = ((LinkedHashSet) c2673p12.f14390f).contains(c2604g02);
                                                }
                                                if (contains) {
                                                    ((ArrayList) c3011n2.f15540g).add(c2604g02);
                                                } else {
                                                    arrayList.add(c2604g02);
                                                }
                                            }
                                            if (!arrayList.isEmpty()) {
                                                break;
                                            }
                                        } else {
                                            throw new SocketException("No route to " + str + ':' + i11 + "; port is out of range");
                                        }
                                    } else {
                                        throw new SocketException("No route to " + c2591a2.f14015h.f14154d + "; exhausted proxy configurations: " + ((List) c3011n2.f15538e));
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    AbstractC1811s.m3076X((ArrayList) c3011n2.f15540g, arrayList);
                                    ((ArrayList) c3011n2.f15540g).clear();
                                }
                                C0691e c0691e4 = new C0691e(5, arrayList);
                                this.f12274h = c0691e4;
                                if (!((C3006i) this.f12272f).f15509t) {
                                    if (((C2258a) this.f12270d).m3664a((C2591a) this.f12271e, (C3006i) this.f12272f, arrayList, false)) {
                                        c3009l = ((C3006i) this.f12272f).f15503n;
                                        AbstractC3367j.m5097b(c3009l);
                                        ((AbstractC2614o) this.f12273g).mo2422a((C3006i) this.f12272f, c3009l);
                                    } else if (c0691e4.m1479d()) {
                                        int i14 = c0691e4.f2244a;
                                        c0691e4.f2244a = i14 + 1;
                                        c2604g0 = (C2604g0) arrayList.get(i14);
                                        C3009l c3009l2 = new C3009l((C2258a) this.f12270d, c2604g0);
                                        ((C3006i) this.f12272f).f15511v = c3009l2;
                                        c3009l2.m4690c(i7, i8, i9, i10, z7, (C3006i) this.f12272f, (AbstractC2614o) this.f12273g);
                                        ((C3006i) this.f12272f).f15511v = null;
                                        c2673p1 = ((C3006i) this.f12272f).f15494e.f14199F;
                                        synchronized (c2673p1) {
                                            ((LinkedHashSet) c2673p1.f14390f).remove(c2604g0);
                                        }
                                        if (((C2258a) this.f12270d).m3664a((C2591a) this.f12271e, (C3006i) this.f12272f, arrayList, true)) {
                                            c3009l = ((C3006i) this.f12272f).f15503n;
                                            AbstractC3367j.m5097b(c3009l);
                                            this.f12276j = c2604g0;
                                            Socket socket = c3009l2.f15518d;
                                            AbstractC3367j.m5097b(socket);
                                            AbstractC2721b.m4359e(socket);
                                            ((AbstractC2614o) this.f12273g).mo2422a((C3006i) this.f12272f, c3009l);
                                        } else {
                                            synchronized (c3009l2) {
                                                C2258a c2258a = (C2258a) this.f12270d;
                                                c2258a.getClass();
                                                byte[] bArr2 = AbstractC2721b.f14569a;
                                                ((ConcurrentLinkedQueue) c2258a.f13097e).add(c3009l2);
                                                ((C2884c) c2258a.f13095c).m4558c((C2883b) c2258a.f13096d, 0L);
                                                ((C3006i) this.f12272f).m4678b(c3009l2);
                                            }
                                            ((AbstractC2614o) this.f12273g).mo2422a((C3006i) this.f12272f, c3009l2);
                                            z9 = z8;
                                            c3009l = c3009l2;
                                            if (c3009l.m4695i(z9)) {
                                            }
                                        }
                                    } else {
                                        throw new NoSuchElementException();
                                    }
                                } else {
                                    throw new IOException("Canceled");
                                }
                            } else {
                                throw new NoSuchElementException();
                            }
                        }
                    }
                    c3009l2.m4690c(i7, i8, i9, i10, z7, (C3006i) this.f12272f, (AbstractC2614o) this.f12273g);
                    ((C3006i) this.f12272f).f15511v = null;
                    c2673p1 = ((C3006i) this.f12272f).f15494e.f14199F;
                    synchronized (c2673p1) {
                    }
                } catch (Throwable th2) {
                    ((C3006i) this.f12272f).f15511v = null;
                    throw th2;
                }
                arrayList = null;
                C3009l c3009l22 = new C3009l((C2258a) this.f12270d, c2604g0);
                ((C3006i) this.f12272f).f15511v = c3009l22;
            }
            z9 = z8;
            if (c3009l.m4695i(z9)) {
            }
        }
        throw new IOException("Canceled");
    }

    /* renamed from: b */
    public boolean m3323b(C2619t c2619t) {
        AbstractC3367j.m5100e(c2619t, "url");
        C2619t c2619t2 = ((C2591a) this.f12271e).f14015h;
        if (c2619t.f14155e == c2619t2.f14155e && AbstractC3367j.m5096a(c2619t.f14154d, c2619t2.f14154d)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m3324c(IOException iOException) {
        AbstractC3367j.m5100e(iOException, "e");
        this.f12276j = null;
        if ((iOException instanceof C3288b0) && ((C3288b0) iOException).f16141e == 8) {
            this.f12267a++;
        } else if (iOException instanceof C3285a) {
            this.f12268b++;
        } else {
            this.f12269c++;
        }
    }

    public C2071d(C2258a c2258a, C2591a c2591a, C3006i c3006i, AbstractC2614o abstractC2614o) {
        AbstractC3367j.m5100e(c2258a, "connectionPool");
        AbstractC3367j.m5100e(abstractC2614o, "eventListener");
        this.f12270d = c2258a;
        this.f12271e = c2591a;
        this.f12272f = c3006i;
        this.f12273g = abstractC2614o;
    }

    public C2071d(byte[] bArr, String str, ArrayList arrayList, String str2, int i7, int i8, int i9) {
        this.f12270d = bArr;
        this.f12271e = str;
        this.f12273g = arrayList;
        this.f12272f = str2;
        this.f12267a = i8;
        this.f12268b = i7;
        this.f12269c = i9;
    }
}
