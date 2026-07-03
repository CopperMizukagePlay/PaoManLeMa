package p048g;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.paoman.lema.MainActivity;
import p006a7.C0129l;
import p041f.C1509a;
import p068i5.AbstractC2080d;
import p102n1.AbstractC2710c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g.b */
/* loaded from: classes.dex */
public final class C1566b extends AbstractC2710c {

    /* renamed from: v */
    public final /* synthetic */ int f10176v;

    public /* synthetic */ C1566b(int i7) {
        this.f10176v = i7;
    }

    @Override // p102n1.AbstractC2710c
    /* renamed from: A */
    public C0129l mo2519A(MainActivity mainActivity, Object obj) {
        switch (this.f10176v) {
            case 0:
                AbstractC3367j.m5100e((String[]) obj, "input");
                return null;
            case 1:
                return null;
            case 2:
                String str = (String) obj;
                AbstractC3367j.m5100e(str, "input");
                if (AbstractC2080d.m3395h(mainActivity, str) == 0) {
                    return new C0129l(10);
                }
                return null;
            default:
                return super.mo2519A(mainActivity, obj);
        }
    }

    @Override // p102n1.AbstractC2710c
    /* renamed from: K */
    public final Object mo2520K(Intent intent, int i7) {
        switch (this.f10176v) {
            case 0:
                if (i7 != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            case 1:
                if (i7 != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            case 2:
                if (intent != null && i7 == -1) {
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z7 = false;
                    if (intArrayExtra != null) {
                        int length = intArrayExtra.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 < length) {
                                if (intArrayExtra[i8] == 0) {
                                    z7 = true;
                                } else {
                                    i8++;
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z7);
                }
                return Boolean.FALSE;
            default:
                return new C1509a(intent, i7);
        }
    }

    @Override // p102n1.AbstractC2710c
    /* renamed from: g */
    public final Intent mo2521g(MainActivity mainActivity, Object obj) {
        switch (this.f10176v) {
            case 0:
                String[] strArr = (String[]) obj;
                AbstractC3367j.m5100e(strArr, "input");
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
                AbstractC3367j.m5099d(type, "setType(...)");
                return type;
            case 1:
                Uri uri = (Uri) obj;
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                    intent.putExtra("android.provider.extra.INITIAL_URI", uri);
                }
                return intent;
            case 2:
                String str = (String) obj;
                AbstractC3367j.m5100e(str, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                AbstractC3367j.m5099d(putExtra, "putExtra(...)");
                return putExtra;
            default:
                Intent intent2 = (Intent) obj;
                AbstractC3367j.m5100e(intent2, "input");
                return intent2;
        }
    }

    public /* synthetic */ C1566b(int i7, boolean z7) {
        this.f10176v = i7;
    }
}
