package p052g4;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.regex.Pattern;
import p022c4.EnumC0391a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g4.e */
/* loaded from: classes.dex */
public abstract class AbstractC1677e {

    /* renamed from: a */
    public static final Pattern f10455a = Pattern.compile(",");

    /* renamed from: b */
    public static final HashMap f10456b;

    static {
        EnumSet of = EnumSet.of(EnumC0391a.f1326p);
        EnumSet of2 = EnumSet.of(EnumC0391a.f1320j);
        EnumSet of3 = EnumSet.of(EnumC0391a.f1315e);
        EnumSet of4 = EnumSet.of(EnumC0391a.f1325o);
        EnumSet of5 = EnumSet.of(EnumC0391a.f1329s, EnumC0391a.f1330t, EnumC0391a.f1322l, EnumC0391a.f1321k, EnumC0391a.f1327q, EnumC0391a.f1328r);
        EnumSet of6 = EnumSet.of(EnumC0391a.f1317g, EnumC0391a.f1318h, EnumC0391a.f1319i, EnumC0391a.f1323m, EnumC0391a.f1316f);
        EnumSet copyOf = EnumSet.copyOf((Collection) of5);
        copyOf.addAll(of6);
        HashMap hashMap = new HashMap();
        f10456b = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of5);
        hashMap.put("QR_CODE_MODE", of);
        hashMap.put("DATA_MATRIX_MODE", of2);
        hashMap.put("AZTEC_MODE", of3);
        hashMap.put("PDF417_MODE", of4);
    }
}
