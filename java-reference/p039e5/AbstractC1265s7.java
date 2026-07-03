package p039e5;

import android.util.Log;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p001a0.AbstractC0094y0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.s7 */
/* loaded from: classes.dex */
public abstract class AbstractC1265s7 {

    /* renamed from: a */
    public static final ConcurrentHashMap.KeySetView f7527a = ConcurrentHashMap.newKeySet();

    /* renamed from: a */
    public static String m2304a(List list) {
        AbstractC3367j.m5100e(list, "addresses");
        if (list.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String hostAddress = ((InetAddress) it.next()).getHostAddress();
            if (hostAddress == null) {
                hostAddress = "";
            }
            arrayList.add(hostAddress);
        }
        return AbstractC1805m.m3051o0(arrayList, null, "[", "]", null, 57);
    }

    /* renamed from: b */
    public static String m2305b(int i7, byte[] bArr) {
        String str;
        if (bArr.length < 12) {
            return AbstractC0094y0.m184k(bArr.length, "packet too short (", ")");
        }
        int m2309f = m2309f(2, bArr);
        int i8 = m2309f & 15;
        if ((m2309f & 32768) != 0) {
            str = "RESP";
        } else {
            str = "REQ";
        }
        return str + " rcode=" + i8 + " qd=" + m2309f(4, bArr) + " an=" + m2309f(6, bArr) + " ns=" + m2309f(8, bArr) + " ar=" + m2309f(10, bArr) + " expectType=" + i7 + " bytes=" + bArr.length;
    }

    /* renamed from: c */
    public static String m2306c(C1485za c1485za) {
        if (c1485za == null) {
            return "无ECS";
        }
        return c1485za.m2437a() + " cidr=" + c1485za.f9840b + " family=" + c1485za.f9841c + " plen=" + c1485za.f9842d + " addr=" + m2307d(16, c1485za.f9843e);
    }

    /* renamed from: d */
    public static String m2307d(int i7, byte[] bArr) {
        if (bArr.length == 0) {
            return "(empty)";
        }
        int min = Math.min(bArr.length, i7);
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < min; i8++) {
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(bArr[i8])}, 1)));
        }
        String sb2 = sb.toString();
        if (bArr.length > i7) {
            return sb2 + " …(+" + (bArr.length - i7) + ")";
        }
        return sb2;
    }

    /* renamed from: e */
    public static void m2308e(String str) {
        AbstractC3367j.m5100e(str, "message");
        if (Log.isLoggable("DnsEcs", 3)) {
            Log.i("DnsEcs", str);
        }
    }

    /* renamed from: f */
    public static int m2309f(int i7, byte[] bArr) {
        return (bArr[i7 + 1] & 255) | ((bArr[i7] & 255) << 8);
    }

    /* renamed from: g */
    public static void m2310g(String str) {
        AbstractC3367j.m5100e(str, "message");
        if (f7527a.add(str)) {
            Log.w("DnsEcs", str);
        }
    }
}
