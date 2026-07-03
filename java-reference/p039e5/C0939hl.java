package p039e5;

import android.net.Network;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.hl */
/* loaded from: classes.dex */
public final class C0939hl extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f4612i;

    /* renamed from: j */
    public final /* synthetic */ C1031kl f4613j;

    /* renamed from: k */
    public final /* synthetic */ InetSocketAddress f4614k;

    /* renamed from: l */
    public final /* synthetic */ Network f4615l;

    /* renamed from: m */
    public final /* synthetic */ int f4616m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0939hl(C1031kl c1031kl, InetSocketAddress inetSocketAddress, Network network, int i7, InterfaceC2313c interfaceC2313c, int i8) {
        super(2, interfaceC2313c);
        this.f4612i = i8;
        this.f4613j = c1031kl;
        this.f4614k = inetSocketAddress;
        this.f4615l = network;
        this.f4616m = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f4612i) {
            case 0:
                C0939hl c0939hl = (C0939hl) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m = C1694m.f10482a;
                c0939hl.mo29m(c1694m);
                return c1694m;
            default:
                C0939hl c0939hl2 = (C0939hl) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m2 = C1694m.f10482a;
                c0939hl2.mo29m(c1694m2);
                return c1694m2;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f4612i) {
            case 0:
                return new C0939hl(this.f4613j, this.f4614k, this.f4615l, this.f4616m, interfaceC2313c, 0);
            default:
                return new C0939hl(this.f4613j, this.f4614k, this.f4615l, this.f4616m, interfaceC2313c, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008d A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #3 {all -> 0x006f, blocks: (B:5:0x0018, B:7:0x0068, B:11:0x007d, B:14:0x008d, B:21:0x00be, B:23:0x00eb, B:25:0x00fc, B:28:0x0106, B:30:0x012b, B:32:0x0139, B:35:0x0145, B:38:0x017f, B:42:0x01e6, B:46:0x02d4, B:48:0x021c, B:50:0x0260, B:55:0x0275, B:58:0x027e, B:60:0x02b5, B:64:0x02c6, B:69:0x02bd, B:72:0x0268, B:74:0x018c, B:77:0x01c9, B:79:0x01d9, B:82:0x02fd, B:86:0x0085, B:89:0x0075), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0085 A[Catch: all -> 0x006f, TryCatch #3 {all -> 0x006f, blocks: (B:5:0x0018, B:7:0x0068, B:11:0x007d, B:14:0x008d, B:21:0x00be, B:23:0x00eb, B:25:0x00fc, B:28:0x0106, B:30:0x012b, B:32:0x0139, B:35:0x0145, B:38:0x017f, B:42:0x01e6, B:46:0x02d4, B:48:0x021c, B:50:0x0260, B:55:0x0275, B:58:0x027e, B:60:0x02b5, B:64:0x02c6, B:69:0x02bd, B:72:0x0268, B:74:0x018c, B:77:0x01c9, B:79:0x01d9, B:82:0x02fd, B:86:0x0085, B:89:0x0075), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008a  */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        DatagramSocket datagramSocket;
        String str;
        String str2;
        String str3;
        String str4;
        InetSocketAddress inetSocketAddress;
        String str5;
        C1062ll m1635a;
        InetSocketAddress inetSocketAddress2;
        InetSocketAddress inetSocketAddress3;
        String str6;
        InetSocketAddress inetSocketAddress4;
        InetSocketAddress inetSocketAddress5;
        String str7;
        String str8;
        switch (this.f4612i) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                datagramSocket = new DatagramSocket((SocketAddress) null);
                C1031kl c1031kl = this.f4613j;
                InetSocketAddress inetSocketAddress6 = this.f4614k;
                Network network = this.f4615l;
                int i7 = this.f4616m;
                try {
                    InetAddress address = inetSocketAddress6.getAddress();
                    AbstractC3367j.m5099d(address, "getAddress(...)");
                    C1031kl.m1620b(c1031kl, datagramSocket, address, network);
                    C1701c0 c1701c0 = c1031kl.f5307d;
                    datagramSocket.setSoTimeout(i7);
                    InetSocketAddress m1624f = C1031kl.m1624f(c1031kl, datagramSocket, inetSocketAddress6);
                    C1062ll m1635a2 = C1062ll.m1635a((C1062ll) c1701c0.getValue(), null, null, null, C1247rk.m2181b(inetSocketAddress6), C1247rk.m2181b(m1624f), null, null, null, null, null, null, "RFC 3489 Test I...", null, null, 57247);
                    c1701c0.getClass();
                    c1701c0.m2752j(null, m1635a2);
                    C0907gl m1630l = C1031kl.m1630l(c1031kl, datagramSocket, inetSocketAddress6, C1247rk.m2191n(6, false), m1624f);
                    if (m1630l == null) {
                        C1062ll m1635a3 = C1062ll.m1635a((C1062ll) c1701c0.getValue(), null, null, null, null, null, null, null, "UDP 被阻断", null, null, null, "未收到 STUN 响应", null, null, 56831);
                        c1701c0.getClass();
                        c1701c0.m2752j(null, m1635a3);
                        datagramSocket.close();
                    } else {
                        InetSocketAddress inetSocketAddress7 = m1630l.f4305a;
                        C0843el c0843el = m1630l.f4307c;
                        InetSocketAddress inetSocketAddress8 = c0843el.f3773a;
                        InetSocketAddress inetSocketAddress9 = c0843el.f3775c;
                        C1062ll c1062ll = (C1062ll) c1701c0.getValue();
                        String m2181b = C1247rk.m2181b(inetSocketAddress7);
                        if (inetSocketAddress8 != null) {
                            str = C1247rk.m2181b(inetSocketAddress8);
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (inetSocketAddress9 != null) {
                            str3 = C1247rk.m2181b(inetSocketAddress9);
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        C1062ll m1635a4 = C1062ll.m1635a(c1062ll, null, null, null, null, m2181b, str2, str4, null, null, null, null, null, null, null, 65087);
                        c1701c0.getClass();
                        c1701c0.m2752j(null, m1635a4);
                        if (inetSocketAddress8 != null && inetSocketAddress9 != null && !AbstractC3367j.m5096a(inetSocketAddress9.getAddress(), inetSocketAddress6.getAddress()) && inetSocketAddress9.getPort() != inetSocketAddress6.getPort()) {
                            C1062ll m1635a5 = C1062ll.m1635a((C1062ll) c1701c0.getValue(), null, null, null, null, null, null, null, null, null, null, null, "RFC 3489 Test II...", null, null, 57343);
                            c1701c0.getClass();
                            c1701c0.m2752j(null, m1635a5);
                            C0907gl m1630l2 = C1031kl.m1630l(c1031kl, datagramSocket, inetSocketAddress6, C1247rk.m2190m(false, true, true), m1624f);
                            if (inetSocketAddress8.equals(inetSocketAddress7)) {
                                if (m1630l2 == null) {
                                    m1635a = C1062ll.m1635a((C1062ll) c1701c0.getValue(), null, null, null, null, null, null, null, "对称 UDP 防火墙", null, null, null, "探测完成", null, null, 56831);
                                } else {
                                    C1062ll c1062ll2 = (C1062ll) c1701c0.getValue();
                                    InetSocketAddress inetSocketAddress10 = m1630l2.f4307c.f3773a;
                                    if (inetSocketAddress10 != null) {
                                        inetSocketAddress8 = inetSocketAddress10;
                                    }
                                    m1635a = C1062ll.m1635a(c1062ll2, null, null, null, null, null, C1247rk.m2181b(inetSocketAddress8), null, "开放互联网", null, null, null, "探测完成", null, null, 56703);
                                }
                                c1701c0.getClass();
                                c1701c0.m2752j(null, m1635a);
                                datagramSocket.close();
                            } else if (m1630l2 != null) {
                                C1062ll c1062ll3 = (C1062ll) c1701c0.getValue();
                                InetSocketAddress inetSocketAddress11 = m1630l2.f4307c.f3773a;
                                if (inetSocketAddress11 != null) {
                                    inetSocketAddress8 = inetSocketAddress11;
                                }
                                C1062ll m1635a6 = C1062ll.m1635a(c1062ll3, null, null, null, null, null, C1247rk.m2181b(inetSocketAddress8), null, "Full Cone NAT", null, null, null, "探测完成", null, null, 56703);
                                c1701c0.getClass();
                                c1701c0.m2752j(null, m1635a6);
                                datagramSocket.close();
                            } else {
                                C1062ll m1635a7 = C1062ll.m1635a((C1062ll) c1701c0.getValue(), null, null, null, null, null, null, null, null, null, null, null, "RFC 3489 Test I(2)...", null, null, 57343);
                                c1701c0.getClass();
                                c1701c0.m2752j(null, m1635a7);
                                C0907gl m1630l3 = C1031kl.m1630l(c1031kl, datagramSocket, inetSocketAddress9, C1247rk.m2191n(6, false), m1624f);
                                if (m1630l3 != null) {
                                    inetSocketAddress = m1630l3.f4307c.f3773a;
                                } else {
                                    inetSocketAddress = null;
                                }
                                if (inetSocketAddress == null) {
                                    C1062ll m1635a8 = C1062ll.m1635a((C1062ll) c1701c0.getValue(), null, null, null, null, null, null, null, "未知", null, null, null, "变更地址无响应", null, null, 56831);
                                    c1701c0.getClass();
                                    c1701c0.m2752j(null, m1635a8);
                                    datagramSocket.close();
                                } else if (!inetSocketAddress.equals(inetSocketAddress8)) {
                                    C1062ll m1635a9 = C1062ll.m1635a((C1062ll) c1701c0.getValue(), null, null, null, null, null, C1247rk.m2181b(inetSocketAddress), null, "Symmetric NAT", null, null, null, "探测完成", null, null, 56703);
                                    c1701c0.getClass();
                                    c1701c0.m2752j(null, m1635a9);
                                    datagramSocket.close();
                                } else {
                                    C1062ll m1635a10 = C1062ll.m1635a((C1062ll) c1701c0.getValue(), null, null, null, null, null, null, null, null, null, null, null, "RFC 3489 Test III...", null, null, 57343);
                                    c1701c0.getClass();
                                    c1701c0.m2752j(null, m1635a10);
                                    C0907gl m1630l4 = C1031kl.m1630l(c1031kl, datagramSocket, inetSocketAddress6, C1247rk.m2191n(2, false), m1624f);
                                    if (m1630l4 != null) {
                                        InetSocketAddress inetSocketAddress12 = m1630l4.f4306b;
                                        if (AbstractC3367j.m5096a(inetSocketAddress12.getAddress(), inetSocketAddress6.getAddress()) && inetSocketAddress12.getPort() != inetSocketAddress6.getPort()) {
                                            str5 = "Restricted Cone NAT";
                                            C1062ll m1635a11 = C1062ll.m1635a((C1062ll) c1701c0.getValue(), null, null, null, null, null, C1247rk.m2181b(inetSocketAddress8), null, str5, null, null, null, "探测完成", null, null, 56703);
                                            c1701c0.getClass();
                                            c1701c0.m2752j(null, m1635a11);
                                            datagramSocket.close();
                                        }
                                    }
                                    str5 = "Port Restricted Cone NAT";
                                    C1062ll m1635a112 = C1062ll.m1635a((C1062ll) c1701c0.getValue(), null, null, null, null, null, C1247rk.m2181b(inetSocketAddress8), null, str5, null, null, null, "探测完成", null, null, 56703);
                                    c1701c0.getClass();
                                    c1701c0.m2752j(null, m1635a112);
                                    datagramSocket.close();
                                }
                            }
                        }
                        C1062ll m1635a12 = C1062ll.m1635a((C1062ll) c1701c0.getValue(), null, null, null, null, null, null, null, "服务器不支持", null, null, null, "服务器未返回可用 CHANGED-ADDRESS", null, null, 56831);
                        c1701c0.getClass();
                        c1701c0.m2752j(null, m1635a12);
                        datagramSocket.close();
                    }
                    return C1694m.f10482a;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            default:
                AbstractC1793a0.m2972L(obj);
                datagramSocket = new DatagramSocket((SocketAddress) null);
                C1031kl c1031kl2 = this.f4613j;
                InetSocketAddress inetSocketAddress13 = this.f4614k;
                Network network2 = this.f4615l;
                int i8 = this.f4616m;
                try {
                    InetAddress address2 = inetSocketAddress13.getAddress();
                    AbstractC3367j.m5099d(address2, "getAddress(...)");
                    C1031kl.m1620b(c1031kl2, datagramSocket, address2, network2);
                    C1701c0 c1701c02 = c1031kl2.f5307d;
                    datagramSocket.setSoTimeout(i8);
                    InetSocketAddress m1624f2 = C1031kl.m1624f(c1031kl2, datagramSocket, inetSocketAddress13);
                    C1062ll m1635a13 = C1062ll.m1635a((C1062ll) c1701c02.getValue(), null, null, null, C1247rk.m2181b(inetSocketAddress13), C1247rk.m2181b(m1624f2), null, null, null, null, null, null, "RFC 5780 Binding Test...", null, null, 57247);
                    c1701c02.getClass();
                    c1701c02.m2752j(null, m1635a13);
                    C0907gl m1630l5 = C1031kl.m1630l(c1031kl2, datagramSocket, inetSocketAddress13, C1247rk.m2191n(6, true), m1624f2);
                    if (m1630l5 != null) {
                        inetSocketAddress2 = m1630l5.f4307c.f3774b;
                        if (inetSocketAddress2 == null) {
                        }
                        if (m1630l5 != null || (inetSocketAddress3 = m1630l5.f4307c.f3776d) == null) {
                            if (m1630l5 == null) {
                                inetSocketAddress3 = m1630l5.f4307c.f3775c;
                            } else {
                                inetSocketAddress3 = null;
                            }
                        }
                        if (m1630l5 != null) {
                            C1062ll m1635a14 = C1062ll.m1635a((C1062ll) c1701c02.getValue(), null, null, null, null, null, null, null, null, "失败", null, null, "未收到 STUN 响应", null, null, 56319);
                            c1701c02.getClass();
                            c1701c02.m2752j(null, m1635a14);
                            datagramSocket.close();
                        } else {
                            InetSocketAddress inetSocketAddress14 = m1630l5.f4305a;
                            if (inetSocketAddress2 == null) {
                                C1062ll m1635a15 = C1062ll.m1635a((C1062ll) c1701c02.getValue(), null, null, null, null, null, null, null, null, "服务器不支持", null, null, "响应缺少 XOR-MAPPED-ADDRESS", null, null, 56319);
                                c1701c02.getClass();
                                c1701c02.m2752j(null, m1635a15);
                                datagramSocket.close();
                            } else {
                                C1062ll c1062ll4 = (C1062ll) c1701c02.getValue();
                                String m2181b2 = C1247rk.m2181b(inetSocketAddress14);
                                String m2181b3 = C1247rk.m2181b(inetSocketAddress2);
                                if (inetSocketAddress3 != null) {
                                    str6 = C1247rk.m2181b(inetSocketAddress3);
                                } else {
                                    str6 = null;
                                }
                                if (str6 == null) {
                                    str6 = "";
                                }
                                C1062ll m1635a16 = C1062ll.m1635a(c1062ll4, null, null, null, null, m2181b2, m2181b3, str6, null, "成功", null, null, null, null, null, 64063);
                                c1701c02.getClass();
                                c1701c02.m2752j(null, m1635a16);
                                if (inetSocketAddress3 != null && !AbstractC3367j.m5096a(inetSocketAddress3.getAddress(), inetSocketAddress13.getAddress()) && inetSocketAddress3.getPort() != inetSocketAddress13.getPort()) {
                                    C1062ll m1635a17 = C1062ll.m1635a((C1062ll) c1701c02.getValue(), null, null, null, null, null, null, null, null, null, null, null, "RFC 5780 Filtering Test II...", null, null, 57343);
                                    c1701c02.getClass();
                                    c1701c02.m2752j(null, m1635a17);
                                    C0907gl m1630l6 = C1031kl.m1630l(c1031kl2, datagramSocket, inetSocketAddress13, C1247rk.m2190m(true, true, true), m1624f2);
                                    String str9 = "服务器不支持";
                                    if (m1630l6 != null) {
                                        if (m1630l6.f4306b.equals(inetSocketAddress3)) {
                                            str9 = "Endpoint-Independent Filtering";
                                        }
                                    } else {
                                        C1062ll m1635a18 = C1062ll.m1635a((C1062ll) c1701c02.getValue(), null, null, null, null, null, null, null, null, null, null, null, "RFC 5780 Filtering Test III...", null, null, 57343);
                                        c1701c02.getClass();
                                        c1701c02.m2752j(null, m1635a18);
                                        C0907gl m1630l7 = C1031kl.m1630l(c1031kl2, datagramSocket, inetSocketAddress13, C1247rk.m2191n(2, true), m1624f2);
                                        if (m1630l7 == null) {
                                            str9 = "Address and Port-Dependent Filtering";
                                        } else {
                                            InetSocketAddress inetSocketAddress15 = m1630l7.f4306b;
                                            if (AbstractC3367j.m5096a(inetSocketAddress15.getAddress(), inetSocketAddress13.getAddress()) && inetSocketAddress15.getPort() != inetSocketAddress13.getPort()) {
                                                str9 = "Address-Dependent Filtering";
                                            }
                                        }
                                    }
                                    C1062ll m1635a19 = C1062ll.m1635a((C1062ll) c1701c02.getValue(), null, null, null, null, null, null, null, null, null, null, str9, null, null, null, 61439);
                                    c1701c02.getClass();
                                    c1701c02.m2752j(null, m1635a19);
                                    if (inetSocketAddress2.equals(inetSocketAddress14)) {
                                        str7 = "Direct";
                                    } else {
                                        C1062ll m1635a20 = C1062ll.m1635a((C1062ll) c1701c02.getValue(), null, null, null, null, null, null, null, null, null, null, null, "RFC 5780 Mapping Test II...", null, null, 57343);
                                        c1701c02.getClass();
                                        c1701c02.m2752j(null, m1635a20);
                                        C0907gl m1630l8 = C1031kl.m1630l(c1031kl2, datagramSocket, new InetSocketAddress(inetSocketAddress3.getAddress(), inetSocketAddress13.getPort()), C1247rk.m2191n(6, true), m1624f2);
                                        if (m1630l8 == null || (inetSocketAddress4 = m1630l8.f4307c.f3774b) == null) {
                                            if (m1630l8 != null) {
                                                inetSocketAddress4 = m1630l8.f4307c.f3773a;
                                            } else {
                                                inetSocketAddress4 = null;
                                            }
                                        }
                                        if (inetSocketAddress4 != null) {
                                            if (inetSocketAddress4.equals(inetSocketAddress2)) {
                                                str7 = "Endpoint-Independent Mapping";
                                            } else {
                                                C1062ll m1635a21 = C1062ll.m1635a((C1062ll) c1701c02.getValue(), null, null, null, null, null, null, null, null, null, null, null, "RFC 5780 Mapping Test III...", null, null, 57343);
                                                c1701c02.getClass();
                                                c1701c02.m2752j(null, m1635a21);
                                                C0907gl m1630l9 = C1031kl.m1630l(c1031kl2, datagramSocket, inetSocketAddress3, C1247rk.m2191n(6, true), m1624f2);
                                                if (m1630l9 == null || (inetSocketAddress5 = m1630l9.f4307c.f3774b) == null) {
                                                    if (m1630l9 != null) {
                                                        inetSocketAddress5 = m1630l9.f4307c.f3773a;
                                                    } else {
                                                        inetSocketAddress5 = null;
                                                    }
                                                }
                                                if (inetSocketAddress5 != null) {
                                                    if (inetSocketAddress5.equals(inetSocketAddress4)) {
                                                        str7 = "Address-Dependent Mapping";
                                                    } else {
                                                        str7 = "Address and Port-Dependent Mapping";
                                                    }
                                                }
                                            }
                                        }
                                        str8 = "失败";
                                        C1062ll m1635a22 = C1062ll.m1635a((C1062ll) c1701c02.getValue(), null, null, null, null, null, null, null, null, null, str8, null, "探测完成", null, null, 55295);
                                        c1701c02.getClass();
                                        c1701c02.m2752j(null, m1635a22);
                                        datagramSocket.close();
                                    }
                                    str8 = str7;
                                    C1062ll m1635a222 = C1062ll.m1635a((C1062ll) c1701c02.getValue(), null, null, null, null, null, null, null, null, null, str8, null, "探测完成", null, null, 55295);
                                    c1701c02.getClass();
                                    c1701c02.m2752j(null, m1635a222);
                                    datagramSocket.close();
                                }
                                C1062ll m1635a23 = C1062ll.m1635a((C1062ll) c1701c02.getValue(), null, null, null, null, null, null, null, null, null, "服务器不支持", "服务器不支持", "服务器未返回可用 OTHER-ADDRESS", null, null, 51199);
                                c1701c02.getClass();
                                c1701c02.m2752j(null, m1635a23);
                                datagramSocket.close();
                            }
                        }
                        return C1694m.f10482a;
                    }
                    if (m1630l5 != null) {
                        inetSocketAddress2 = m1630l5.f4307c.f3773a;
                    } else {
                        inetSocketAddress2 = null;
                    }
                    if (m1630l5 != null) {
                    }
                    if (m1630l5 == null) {
                    }
                    if (m1630l5 != null) {
                    }
                    return C1694m.f10482a;
                } finally {
                }
        }
    }
}
