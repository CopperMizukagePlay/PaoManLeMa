package p039e5;

import org.json.JSONObject;
import p024c6.AbstractC0444k;
import p053g5.C1687f;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.xe */
/* loaded from: classes.dex */
public final /* synthetic */ class C1427xe implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f8667e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f8668f;

    public /* synthetic */ C1427xe(JSONObject jSONObject, int i7) {
        this.f8667e = i7;
        this.f8668f = jSONObject;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        String str = (String) obj;
        switch (this.f8667e) {
            case 0:
                String optString = this.f8668f.optString(str);
                AbstractC3367j.m5099d(optString, "optString(...)");
                String obj2 = AbstractC0444k.m956t0(optString).toString();
                AbstractC3367j.m5097b(str);
                if (!AbstractC0444k.m937a0(str) && !AbstractC0444k.m937a0(obj2)) {
                    return new C1687f(str, obj2);
                }
                return null;
            default:
                String optString2 = this.f8668f.optString(str);
                AbstractC3367j.m5099d(optString2, "optString(...)");
                String obj3 = AbstractC0444k.m956t0(optString2).toString();
                AbstractC3367j.m5097b(str);
                if (!AbstractC0444k.m937a0(str) && !AbstractC0444k.m937a0(obj3)) {
                    return new C1687f(str, obj3);
                }
                return null;
        }
    }
}
