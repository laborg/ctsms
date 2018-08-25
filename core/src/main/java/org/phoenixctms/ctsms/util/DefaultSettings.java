package org.phoenixctms.ctsms.util;

import java.util.ArrayList;

import org.phoenixctms.ctsms.enumeration.VariablePeriod;

public final class DefaultSettings {

	public static final String ZIP_CODE_REGEXP = "^[0-9]{4}$";
	public static final String INLAND = "";
	public static final boolean USE_EXTERNAL_FILE_DATA_DIR = false;
	public static final String EXTERNAL_FILE_DATA_DIR = "";
	public final static String HTTP_DOCUMENT_ROOT = "";
	public final static String HTTP_DOCUMENT_ROOT_REPLACEMENT = "";
	public static final String EMAIL_DOMAIN_NAME = "{0}";
	public static final String HTTP_DOMAIN_NAME = "localhost";
	public static final String HTTP_BASE_URL = "{0}://{1}";
	public static final String HTTP_HOST = "{1}:80";
	public final static String HTTP_SCHEME = "https";
	public final static String INSTANCE_NAME = "{0}";
	// public final static int PBE_KEY_ITERATIONS = 1;
	public static final int EXTERNAL_FILE_SIZE_LIMIT = 1024 * 1024 * 30;
	public static final int EXTERNAL_FILE_CONTENT_SIZE_LIMIT = 1024 * 1024 * 5;
	public static final int EXTERNAL_FILE_CONTENT_STREAM_THRESHOLD = 1024 * 1024 * 10;
	public static final int HOLIDAY_SHIFT_THRESHOLD_SECS = 6 * 60 * 60;
	public static final int NIGHT_SHIFT_THRESHOLD_SECS = 4 * 60 * 60;
	public static final int SHIFT_EXTRA_SECS = 3 * 60 * 60;
	public static final int NIGHT_INTERVAL_START_HOUR = 22;
	public static final int NIGHT_INTERVAL_START_MINUTE = 0;
	public static final int NIGHT_INTERVAL_STOP_HOUR = 6;
	public static final int NIGHT_INTERVAL_STOP_MINUTE = 0;
	public static final VariablePeriod NOTIFICATION_EXPIRING_COURSE_REMINDER_PERIOD = VariablePeriod.MONTH;
	public static final Long NOTIFICATION_EXPIRING_COURSE_REMINDER_PERIOD_DAYS = null;
	public static final VariablePeriod NOTIFICATION_EXPIRING_COURSE_PARTICIPATION_REMINDER_PERIOD = VariablePeriod.MONTH;
	public static final Long NOTIFICATION_EXPIRING_COURSE_PARTICIPATION_REMINDER_PERIOD_DAYS = null;
	public static final VariablePeriod NOTIFICATION_EXPIRING_PROBAND_AUTO_DELETE_REMINDER_PERIOD = VariablePeriod.EXPLICIT;
	public static final Long NOTIFICATION_EXPIRING_PROBAND_AUTO_DELETE_REMINDER_PERIOD_DAYS = 7l;
	public static final VariablePeriod NOTIFICATION_EXPIRING_PASSWORD_REMINDER_PERIOD = VariablePeriod.EXPLICIT;
	public static final Long NOTIFICATION_EXPIRING_PASSWORD_REMINDER_PERIOD_DAYS = 10l;
	public static final VariablePeriod NOTIFICATION_VISIT_SCHEDULE_ITEM_REMINDER_PERIOD = VariablePeriod.EXPLICIT;
	public static final Long NOTIFICATION_VISIT_SCHEDULE_ITEM_REMINDER_PERIOD_DAYS = 10l;
	public static final boolean LDAP_FAILOVER = false;
	public static final boolean ADMIN_IGNORE_POLICY = false;
	public static final int DISTANCE_PASSWORD_HISTORY = 0;
	public static final int MIN_LEVENSHTEIN_DISTANCE = 0;
	public static final int MIN_LENGTH = 0;
	public static final int MAX_LENGTH = 0;
	public static final boolean ALLOW_SYMBOLS = false;
	public static final boolean ALLOW_ALT_SYMBOLS = false;
	public static final boolean ALLOW_WHITESPACES = false;
	public static final boolean ALLOW_UMLAUTS = false;
	public static final boolean ALLOW_DIGITS = false;
	public static final boolean ALLOW_CAPITAL_LETTERS = false;
	public static final boolean ALLOW_SMALL_LETTERS = false;
	public static final Long EMAIL_PROCESS_NOTIFICATIONS_MAX = 3l;
	public static final boolean EMAIL_NOTIFICATIONS_ENABLED = false;
	public static final String EMAIL_NOTIFICATION_FROM_ADDRESS = null;
	public static final String EMAIL_NOTIFICATION_FROM_NAME = null;
	public static final String EMAIL_EXEC_FROM_ADDRESS = null;
	public static final String EMAIL_EXEC_FROM_NAME = null;
	public static final int JOURNAL_ENTRY_COMMENT_VO_DEPTH = 1;
	public static final boolean JOURNAL_ENTRY_COMMENT_ENUMERATE_ENTITIES = false;
	public static final boolean JOURNAL_ENTRY_COMMENT_ENUMERATE_REFERENCES = true;
	public static final boolean JOURNAL_ENTRY_COMMENT_ENUMERATE_COLLECTIONS = true;
	public static final boolean JOURNAL_ENTRY_COMMENT_ENUMERATE_MAPS = true;
	public static final String JOURNAL_ENTRY_COMMENT_LINE_SEPARATOR = "\n";
	public static final String JOURNAL_ENTRY_COMMENT_SINGLE_LINE = "{0}{1}: {2}";
	public static final String JOURNAL_ENTRY_COMMENT_MULTI_LINE_HEAD = "{0}{1}:{2}";
	public static final String JOURNAL_ENTRY_COMMENT_MULTI_LINE_TAIL = "{0}{1}{2}";
	public static final boolean JOURNAL_ENTRY_COMMENT_NORMALIZE_MULTI_LINE_SEPARATOR = true;
	public static final String JOURNAL_ENTRY_COMMENT_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	public static final String JOURNAL_ENTRY_COMMENT_DATE_PATTERN = "yyyy-MM-dd";
	public static final String JOURNAL_ENTRY_COMMENT_TIME_PATTERN = "HH:mm:ss";
	public static final boolean JOURNAL_ENTRY_COMMENT_SKIP_EMPTY_FIELDS = true;
	public static final String JOURNAL_ENTRY_COMMENT_INDENT = "  "; // "\t";
	public static final boolean JOURNAL_ENTRY_COMMENT_SKIP_FIELDS_WITHOUT_LOCALIZATION = false;
	public static final int AUDIT_TRAIL_CHANGE_COMMENT_VO_DEPTH = 1;
	public static final boolean AUDIT_TRAIL_CHANGE_COMMENT_ENUMERATE_ENTITIES = false;
	public static final boolean AUDIT_TRAIL_CHANGE_COMMENT_ENUMERATE_REFERENCES = true;
	public static final boolean AUDIT_TRAIL_CHANGE_COMMENT_ENUMERATE_COLLECTIONS = true;
	public static final boolean AUDIT_TRAIL_CHANGE_COMMENT_ENUMERATE_MAPS = true;
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_LINE_SEPARATOR = "\n";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_SINGLE_LINE = "{0}{1}: {2}";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_MULTI_LINE_HEAD = "{0}{1}:{2}";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_MULTI_LINE_TAIL = "{0}{1}{2}";
	public static final boolean AUDIT_TRAIL_CHANGE_COMMENT_NORMALIZE_MULTI_LINE_SEPARATOR = true;
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_DATE_PATTERN = "yyyy-MM-dd";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_TIME_PATTERN = "HH:mm:ss";
	public static final boolean AUDIT_TRAIL_CHANGE_COMMENT_SKIP_EMPTY_FIELDS = true;
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_INDENT = "  "; // "\t";
	public static final boolean AUDIT_TRAIL_CHANGE_COMMENT_SKIP_FIELDS_WITHOUT_LOCALIZATION = true;
	public static final boolean NOTIFY_ALL_DEPARTMENT_RECIPIENTS = true;
	public static final Integer STAFF_INACTIVE_VISIT_SCHEDULE_ITEM_NOTIFICATION_STAFF_LIMIT = null;
	public static final boolean STAFF_INACTIVE_VISIT_SCHEDULE_ITEM_NOTIFICATION_PER_DAY = true;
	public static final boolean STAFF_INACTIVE_VISIT_SCHEDULE_ITEM_NOTIFICATION_ALL_TRIALS = true;
	public static final boolean STAFF_INACTIVE_VISIT_SCHEDULE_ITEM_NOTIFICATION_ALL_STAFF = true;
	public static final boolean NOTIFY_SUPERVISOR_DUTY_ROSTER_TURN_UPDATES = false;
	public static final int NOTIFICATION_TEMPLATE_MODEL_VO_DEPTH = 3; // 2;
	public static final String NOTIFICATION_TEMPLATE_MODEL_DATETIME_PATTERN = "yyyy-MM-dd HH:mm";
	public static final String NOTIFICATION_TEMPLATE_MODEL_DATE_PATTERN = "yyyy-MM-dd";
	public static final String NOTIFICATION_TEMPLATE_MODEL_TIME_PATTERN = "HH:mm";
	public static final boolean NOTIFICATION_TEMPLATE_MODEL_OMIT_ENCRYPTED_FIELDS = true;
	public static final boolean NOTIFICATION_TEMPLATE_MODEL_ENUMERATE_ENTITIES = true;
	public static final boolean NOTIFICATION_TEMPLATE_MODEL_ENUMERATE_REFERENCES = true;
	public static final boolean NOTIFICATION_TEMPLATE_MODEL_ENUMERATE_COLLECTIONS = false;
	public static final boolean NOTIFICATION_TEMPLATE_MODEL_ENUMERATE_MAPS = false;
	public static final String PROBAND_LIST_STATUS_REASON_DATETIME_PATTERN = "yyyy-MM-dd HH:mm";
	public static final int PROBAND_LAST_NAME_INDEX_LENGTH = 0;
	public static final boolean HASH_FOR_SEARCH = false;
	public static final boolean ENABLE_AUTHORISATION = true;
	public static final boolean ENABLE_HOST_BASED_AUTHORISATION = true;
	public static final String SIGNATURE_COMMENT_LINE_SEPARATOR = "\n";
	public static final String SIGNATURE_COMMENT_KEY_VALUE_SEPARATOR = "=";
	public static final int TRIAL_SIGNATURE_ENTITY_DEPTH = 3;
	public static final int ECRF_SIGNATURE_ENTITY_DEPTH = 3;
	public static final Integer MAX_MISSING_ECRF_FIELD_VALUES = 100;
	public static final Integer INPUT_FIELD_IMAGE_SIZE_LIMIT = 5 * 1024 * 1024;
	public static final Integer INPUT_FIELD_TRUNCATED_STRING_VALUE_MAX_LENGTH = 1024;
	public static final Integer BANK_CODE_NUMBER_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer BANK_IDENTIFICATION_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer BANK_NAME_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer BIC_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer CITY_NAME_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer COUNTRY_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer CRITERIA_CATEGORY_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer COUNTRY_NAME_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer INPUT_FIELD_CATEGORY_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer INPUT_FIELD_SELECTION_SET_VALUE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer INPUT_FIELD_TEXT_VALUE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer INQUIRY_CATEGORY_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer ECRF_FIELD_SECTION_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer STREET_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer STREET_NAME_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer TITLE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer ZIP_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer ZIP_CODE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer FILE_FOLDER_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer ALPHA_ID_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer ALPHA_ID_TEXT_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer ALPHA_ID_CODE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer OPS_CODE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer OPS_CODE_TEXT_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer OPS_CODE_CODE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer ICD_SYST_BLOCK_PREFERRED_RUBRIC_LABEL_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer ICD_SYST_CATEGORY_PREFERRED_RUBRIC_LABEL_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer OPS_SYST_BLOCK_PREFERRED_RUBRIC_LABEL_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer OPS_SYST_CATEGORY_PREFERRED_RUBRIC_LABEL_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer ASP_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer ASP_NAME_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer ASP_SUBSTANCE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer ASP_SUBSTANCE_NAME_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer ASP_ATC_CODE_CODE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer MEDICATION_DOSE_UNIT_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer MONEY_TRANSFER_COST_TYPE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer DUTY_ROSTER_TURN_CALENDAR_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer DUTY_ROSTER_TURN_TITLE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer INVENTORY_BOOKING_CALENDAR_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 10;
	public static final Integer LDAP_ENTRIES_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer PROBAND_LIST_ENTRY_TAG_FIELD_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer INQUIRY_FIELD_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer INPUT_FIELD_SELECTION_SET_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer ECRF_FIELD_FIELD_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final Integer SYSTEM_MESSAGE_CODE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = 5;
	public static final String OPS_CODE_REVISION = null;
	public static final String ALPHA_ID_REVISION = null;
	public static final String ASP_REVISION = null;
	public static final VariablePeriod PROBAND_AUTODELETE_GRACE_PERIOD = VariablePeriod.MONTH;
	public static final Long PROBAND_AUTODELETE_GRACE_PERIOD_DAYS = null;
	public static final Integer STAFF_IMAGE_SIZE_LIMIT = 5 * 1024 * 1024;
	public static final Integer STAFF_IMAGE_MIN_WIDTH = 320;
	public static final Integer STAFF_IMAGE_MIN_HEIGHT = 240;
	public static final Integer PROBAND_IMAGE_SIZE_LIMIT = 5 * 1024 * 1024;
	public static final Integer PROBAND_IMAGE_MIN_WIDTH = 320;
	public static final Integer PROBAND_IMAGE_MIN_HEIGHT = 240;
	public static final int PDFBOX_PUSH_BACK_SIZE = 131072;
	public static final boolean LOG_SEARCH_FILTERED = false;
	public static final boolean ENABLE_SERVICE_EXCEPTION_LOGGER = true;
	public static final boolean ENABLE_AUTHENTICATION_EXCEPTION_LOGGER = false;
	public static final boolean ENABLE_AUTHORISATION_EXCEPTION_LOGGER = false;
	public static final boolean ENABLE_OTHER_EXCEPTION_LOGGER = true;
	public static final boolean BOOKING_SUMMARY_FULL_BOOKINGS = true;
	public static final boolean BOOKING_SUMMARY_FULL_UNAVAILABILITIES = false;
	public static final boolean BOOKING_SUMMARY_MERGE_OVERLAPPING = false;
	public static final boolean SHIFT_SUMMARY_FULL_SHIFTS = true;
	public static final boolean SHIFT_SUMMARY_FULL_ABSENCES = false;
	public static final VariablePeriod RECENT_JOURNAL_ENTRY_PERIOD = VariablePeriod.MONTH;
	public static final Long RECENT_JOURNAL_ENTRY_PERIOD_DAYS = null;
	public static final String TRUSTED_IP_RANGES = null;
	public static final boolean SIGNUP_FROM_UNTRUSTED_HOSTS = false;
	public static final String EXCEPTION_DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm";
	public static final String EXCEPTION_DATE_PATTERN = "yyyy-MM-dd";
	public static final int EMAIL_PROCESS_NOTIFICATIONS_DELAY_MILLIS = 10;
	public static final String CURRENCY_SYMBOL = "EUR";
	public static final boolean UPDATE_INPUT_FIELD_CHECK_PROBAND_TRIAL_LOCKED = false;
	public static final boolean REMOVE_PROBAND_CHECK_TRIAL_LOCKED = false;
	public static final boolean REMOVE_ECRF_CHECK_PROBAND_LOCKED = false;
	public static final boolean REMOVE_INQUIRY_CHECK_PROBAND_LOCKED = false;
	public static final boolean REMOVE_LIST_ENTRY_TAG_CHECK_PROBAND_LOCKED = false;
	public static final boolean REMOVE_TRIAL_CHECK_PROBAND_LOCKED = false;
	public static final boolean UNIQUE_ECRF_NAMES = false;

	public static final String SIGNATURE_DESCRIPTION_DATETIME_PATTERN = "yyyy-MM-dd HH:mm";
	public static final boolean INQUIRY_VALUES_ENABLE_BROWSER_FIELD_CALCULATION = true;
	public static final boolean PROBAND_LIST_ENTRY_TAG_VALUES_ENABLE_BROWSER_FIELD_CALCULATION = true;
	public static final boolean ECRF_FIELD_VALUES_ENABLE_BROWSER_FIELD_CALCULATION = true;

	public static final ArrayList<String> NEW_ECRF_FIELD_STATUS_NOTIFICATION_QUEUES = new ArrayList<String>();
	public static final ArrayList<String> RESOLVE_ECRF_FIELD_STATUS_RESTRICTION_QUEUES = new ArrayList<String>();
	public static final Integer ECRF_FIELD_VALUES_SCHEDULE_VALIDATION_LIMIT = 200;
	// public static final String ECRF_JOURNAL_ENTRY_TITLE_REGEXP = "(?i)ecrf";
	public static final boolean REMOVE_MASS_MAIL_CHECK_PROBAND_LOCKED = false;

	public static final int MASS_MAIL_TEMPLATE_MODEL_VO_DEPTH = 3; // 2;
	public static final String MASS_MAIL_TEMPLATE_MODEL_DATETIME_PATTERN = "yyyy-MM-dd HH:mm";
	public static final String MASS_MAIL_TEMPLATE_MODEL_DATE_PATTERN = "yyyy-MM-dd";
	public static final String MASS_MAIL_TEMPLATE_MODEL_TIME_PATTERN = "HH:mm";
	public static final boolean MASS_MAIL_TEMPLATE_MODEL_OMIT_ENCRYPTED_FIELDS = false;
	public static final boolean MASS_MAIL_TEMPLATE_MODEL_ENUMERATE_ENTITIES = true;
	public static final boolean MASS_MAIL_TEMPLATE_MODEL_ENUMERATE_REFERENCES = true;
	public static final boolean MASS_MAIL_TEMPLATE_MODEL_ENUMERATE_COLLECTIONS = false;
	public static final boolean MASS_MAIL_TEMPLATE_MODEL_ENUMERATE_MAPS = false;
	public static final boolean REMOVE_PROBAND_KEEP_SENT_MASS_MAIL_RECIPIENTS = true;
	public static final boolean SEND_MASS_MAILS = true;
	public static final int EMAIL_PROCESS_MASS_MAILS_DELAY_MILLIS = 10;
	public static final Long EMAIL_PROCESS_MASS_MAILS_MAX = 3l;
	public static final Long MASS_MAIL_MIME_MESSAGE_MAX_AGE_SECONDS = 60l * 60l;
	public static final String RESOLVE_MAIL_ADDRESS_DOMAIN_NAME = "phoenix";

	static {
		NEW_ECRF_FIELD_STATUS_NOTIFICATION_QUEUES.add("VALIDATION");
		NEW_ECRF_FIELD_STATUS_NOTIFICATION_QUEUES.add("QUERY");
		// NEW_ECRF_FIELD_STATUS_NOTIFICATION_QUEUES.add("ANNOTATION");
		RESOLVE_ECRF_FIELD_STATUS_RESTRICTION_QUEUES.add("QUERY");
	}

	// public final static String ENV_JS_FILE_NAME = "env.js";
	// public final static String FIELD_CALCULATION_JS_FILE_NAME = "fieldCalculation.js";
	// public final static String SPRINTF_JS_FILE_NAME = "sprintf.js";
	// public final static String DATE_JS_FILE_NAME = "date.js";
	// public final static String TIME_JS_FILE_NAME = "time.js";
	// public final static String STRIP_COMMENTS_JS_FILE_NAME = "strip-comments.js";
	// public final static String JQUERY_BASE64_JS_FILE_NAME = "jquery.base64.js";
	// public final static String REST_API_SHIM_JS_FILE_NAME = "restApiShim.js";
	// public final static String LOCATION_DISTANCE_SHIM_JS_FILE_NAME = "locationDistanceShim.js";

	private DefaultSettings() {
	}
}
