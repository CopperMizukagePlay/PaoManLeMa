package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import p021c3.AbstractC0390a;
import p144t.AbstractC3122c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f809k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public Object f811b;

    /* renamed from: j */
    public String f819j;

    /* renamed from: a */
    public int f810a = -1;

    /* renamed from: c */
    public byte[] f812c = null;

    /* renamed from: d */
    public Parcelable f813d = null;

    /* renamed from: e */
    public int f814e = 0;

    /* renamed from: f */
    public int f815f = 0;

    /* renamed from: g */
    public ColorStateList f816g = null;

    /* renamed from: h */
    public PorterDuff.Mode f817h = f809k;

    /* renamed from: i */
    public String f818i = null;

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        int i7;
        if (this.f810a == -1) {
            return String.valueOf(this.f811b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f810a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case AbstractC3122c.f15761f /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case AbstractC3122c.f15759d /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f810a) {
            case 1:
            case AbstractC3122c.f15761f /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f811b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f811b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f819j);
                sb.append(" id=");
                int i8 = this.f810a;
                if (i8 == -1) {
                    Object obj = this.f811b;
                    if (Build.VERSION.SDK_INT >= 28) {
                        i7 = AbstractC0390a.m860c(obj);
                    } else {
                        try {
                            i7 = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e7) {
                            Log.e("IconCompat", "Unable to get icon resource", e7);
                            i7 = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i7)));
                            if (this.f816g != null) {
                            }
                            if (this.f817h != f809k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (NoSuchMethodException e8) {
                            Log.e("IconCompat", "Unable to get icon resource", e8);
                            i7 = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i7)));
                            if (this.f816g != null) {
                            }
                            if (this.f817h != f809k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (InvocationTargetException e9) {
                            Log.e("IconCompat", "Unable to get icon resource", e9);
                            i7 = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i7)));
                            if (this.f816g != null) {
                            }
                            if (this.f817h != f809k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        }
                    }
                } else if (i8 == 2) {
                    i7 = this.f814e;
                } else {
                    throw new IllegalStateException("called getResId() on " + this);
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i7)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f814e);
                if (this.f815f != 0) {
                    sb.append(" off=");
                    sb.append(this.f815f);
                    break;
                }
                break;
            case 4:
            case AbstractC3122c.f15759d /* 6 */:
                sb.append(" uri=");
                sb.append(this.f811b);
                break;
        }
        if (this.f816g != null) {
            sb.append(" tint=");
            sb.append(this.f816g);
        }
        if (this.f817h != f809k) {
            sb.append(" mode=");
            sb.append(this.f817h);
        }
        sb.append(")");
        return sb.toString();
    }
}
