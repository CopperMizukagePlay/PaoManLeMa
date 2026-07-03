package p099m6;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0053n;
import p053g5.C1691j;
import p060h5.AbstractC1807o;
import p102n1.AbstractC2710c;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.q */
/* loaded from: classes.dex */
public final class C2616q {

    /* renamed from: a */
    public final EnumC2606h0 f14137a;

    /* renamed from: b */
    public final C2603g f14138b;

    /* renamed from: c */
    public final List f14139c;

    /* renamed from: d */
    public final C1691j f14140d;

    public C2616q(EnumC2606h0 enumC2606h0, C2603g c2603g, List list, InterfaceC3277a interfaceC3277a) {
        this.f14137a = enumC2606h0;
        this.f14138b = c2603g;
        this.f14139c = list;
        this.f14140d = AbstractC2710c.m4327J(new C0053n(interfaceC3277a));
    }

    /* renamed from: a */
    public final List m4163a() {
        return (List) this.f14140d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2616q) {
            C2616q c2616q = (C2616q) obj;
            if (c2616q.f14137a == this.f14137a && AbstractC3367j.m5096a(c2616q.f14138b, this.f14138b) && AbstractC3367j.m5096a(c2616q.m4163a(), m4163a()) && AbstractC3367j.m5096a(c2616q.f14139c, this.f14139c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14139c.hashCode() + ((m4163a().hashCode() + ((this.f14138b.hashCode() + ((this.f14137a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> m4163a = m4163a();
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(m4163a));
        for (Certificate certificate : m4163a) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                AbstractC3367j.m5099d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f14137a);
        sb.append(" cipherSuite=");
        sb.append(this.f14138b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f14139c;
        ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                AbstractC3367j.m5099d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
