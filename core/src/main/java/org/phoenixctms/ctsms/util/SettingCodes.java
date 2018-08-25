package org.phoenixctms.ctsms.util;

public interface SettingCodes {

	public final static String ZIP_CODE_REGEXP = "zip_code_regexp";
	public static final String INLAND = "inland";
	public final static String USE_EXTERNAL_FILE_DATA_DIR = "use_external_file_data_dir";
	public final static String EXTERNAL_FILE_DATA_DIR = "external_file_data_dir";
	public final static String HTTP_DOCUMENT_ROOT = "http_document_root";
	public final static String HTTP_DOCUMENT_ROOT_REPLACEMENT = "http_document_root_replacement";
	public final static String EMAIL_DOMAIN_NAME = "email_domain_name";
	public final static String HTTP_DOMAIN_NAME = "http_domain_name";
	public final static String HTTP_BASE_URL = "http_base_url";
	public final static String HTTP_HOST = "http_host";
	public final static String HTTP_SCHEME = "http_scheme";
	public final static String INSTANCE_NAME = "instance_name";
	// public final static String PBE_KEY_ITERATIONS = "pbe_key_iterations";
	public final static String EXTERNAL_FILE_SIZE_LIMIT = "external_file_size_limit";
	public final static String EXTERNAL_FILE_CONTENT_SIZE_LIMIT = "external_file_content_size_limit";
	public final static String EXTERNAL_FILE_CONTENT_STREAM_THRESHOLD = "external_file_content_stream_threshold";
	public static final String HOLIDAY_SHIFT_THRESHOLD_SECS = "holiday_shift_threshold_secs";
	public static final String NIGHT_SHIFT_THRESHOLD_SECS = "night_shift_threshold_secs";
	public static final String SHIFT_EXTRA_SECS = "shift_extra_secs";
	public static final String NIGHT_INTERVAL_START_HOUR = "night_interval_start_hour";
	public static final String NIGHT_INTERVAL_START_MINUTE = "night_interval_start_minute";
	public static final String NIGHT_INTERVAL_STOP_HOUR = "night_interval_stop_hour";
	public static final String NIGHT_INTERVAL_STOP_MINUTE = "night_interval_stop_minute";
	public static final String APPLICATION_VERSION = "application_version";
	public static final String APPLICATION_NAME = "application_name";
	// public static final String APPLICATION_SITE = "application_site";
	public static final String APPLICATION_ABBREVIATION = "application_abbreviation";
	public static final String SQL_UNION_KEYWORD = "sql_union_keyword";
	public static final String SQL_INTERSECT_KEYWORD = "sql_intersect_keyword";
	public static final String SQL_EXCEPT_KEYWORD = "sql_except_keyword";
	public static final String LDAP_FAILOVER = "ldap_failover";
	public static final String PASSWORD_MIN_LENGTH = "password_min_length";
	public static final String PASSWORD_MAX_LENGTH = "password_max_length";
	public static final String PASSWORD_ALLOW_SMALL_LETTERS = "password_allow_small_letters";
	public static final String PASSWORD_ALLOW_CAPITAL_LETTERS = "password_allow_capital_letters";
	public static final String PASSWORD_ALLOW_DIGITS = "password_allow_digits";
	public static final String PASSWORD_ALLOW_UMLAUTS = "password_allow_umlauts";
	public static final String PASSWORD_ALLOW_WHITESPACES = "password_allow_whitespaces";
	public static final String PASSWORD_ALLOW_ALT_SYMBOLS = "password_allow_alt_symbols";
	public static final String PASSWORD_ALLOW_SYMBOLS = "password_allow_symbols";
	public static final String PASSWORD_MIN_SMALL_LETTERS = "password_min_small_letters";
	public static final String PASSWORD_MIN_CAPITAL_LETTERS = "password_min_capital_letters";
	public static final String PASSWORD_MIN_DIGITS = "password_min_digits";
	public static final String PASSWORD_MIN_UMLAUTS = "password_min_umlauts";
	public static final String PASSWORD_MIN_WHITESPACES = "password_min_whitespaces";
	public static final String PASSWORD_MIN_ALT_SYMBOLS = "password_min_alt_symbols";
	public static final String PASSWORD_MIN_SYMBOLS = "password_min_symbols";
	public static final String PASSWORD_MAX_SMALL_LETTERS = "password_max_small_letters";
	public static final String PASSWORD_MAX_CAPITAL_LETTERS = "password_max_capital_letters";
	public static final String PASSWORD_MAX_DIGITS = "password_max_digits";
	public static final String PASSWORD_MAX_UMLAUTS = "password_max_umlauts";
	public static final String PASSWORD_MAX_WHITESPACES = "password_max_whitespaces";
	public static final String PASSWORD_MAX_ALT_SYMBOLS = "password_max_alt_symbols";
	public static final String PASSWORD_MAX_SYMBOLS = "password_max_symbols";
	public static final String PASSWORD_MIN_LEVENSHTEIN_DISTANCE = "password_min_levenshtein_distance";
	public static final String PASSWORD_DISTANCE_PASSWORD_HISTORY = "password_distance_password_history";
	public static final String PASSWORD_ADMIN_IGNORE_POLICY = "password_admin_ignore_policy";
	public static final String DEPARTMENT_PASSWORD_MIN_LENGTH = "department_password_min_length";
	public static final String DEPARTMENT_PASSWORD_MAX_LENGTH = "department_password_max_length";
	public static final String DEPARTMENT_PASSWORD_ALLOW_SMALL_LETTERS = "department_password_allow_small_letters";
	public static final String DEPARTMENT_PASSWORD_ALLOW_CAPITAL_LETTERS = "department_password_allow_capital_letters";
	public static final String DEPARTMENT_PASSWORD_ALLOW_DIGITS = "department_password_allow_digits";
	public static final String DEPARTMENT_PASSWORD_ALLOW_UMLAUTS = "department_password_allow_umlauts";
	public static final String DEPARTMENT_PASSWORD_ALLOW_WHITESPACES = "department_password_allow_whitespaces";
	public static final String DEPARTMENT_PASSWORD_ALLOW_ALT_SYMBOLS = "department_password_allow_alt_symbols";
	public static final String DEPARTMENT_PASSWORD_ALLOW_SYMBOLS = "department_password_allow_symbols";
	public static final String DEPARTMENT_PASSWORD_MIN_SMALL_LETTERS = "department_password_min_small_letters";
	public static final String DEPARTMENT_PASSWORD_MIN_CAPITAL_LETTERS = "department_password_min_capital_letters";
	public static final String DEPARTMENT_PASSWORD_MIN_DIGITS = "department_password_min_digits";
	public static final String DEPARTMENT_PASSWORD_MIN_UMLAUTS = "department_password_min_umlauts";
	public static final String DEPARTMENT_PASSWORD_MIN_WHITESPACES = "department_password_min_whitespaces";
	public static final String DEPARTMENT_PASSWORD_MIN_ALT_SYMBOLS = "department_password_min_alt_symbols";
	public static final String DEPARTMENT_PASSWORD_MIN_SYMBOLS = "department_password_min_symbols";
	public static final String DEPARTMENT_PASSWORD_MAX_SMALL_LETTERS = "department_password_max_small_letters";
	public static final String DEPARTMENT_PASSWORD_MAX_CAPITAL_LETTERS = "department_password_max_capital_letters";
	public static final String DEPARTMENT_PASSWORD_MAX_DIGITS = "department_password_max_digits";
	public static final String DEPARTMENT_PASSWORD_MAX_UMLAUTS = "department_password_max_umlauts";
	public static final String DEPARTMENT_PASSWORD_MAX_WHITESPACES = "department_password_max_whitespaces";
	public static final String DEPARTMENT_PASSWORD_MAX_ALT_SYMBOLS = "department_password_max_alt_symbols";
	public static final String DEPARTMENT_PASSWORD_MAX_SYMBOLS = "department_password_max_symbols";
	public static final String LOGON_EXPIRES = "logon_expires";
	public static final String LOGON_PROLONGABLE = "logon_prolongable";
	public static final String LOGON_VALIDITY_PERIOD = "logon_validity_period";
	public static final String LOGON_VALIDITY_PERIOD_DAYS = "logon_validity_period_days";
	public static final String LOGON_LIMIT_LOGONS = "logon_limit_logons";
	public static final String LOGON_MAX_SUCCESSFUL_LOGONS = "logon_max_successful_logons";
	public static final String LOGON_LIMIT_WRONG_PASSWORD_ATTEMPTS = "logon_limit_wrong_password_attempts";
	public static final String LOGON_MAX_WRONG_PASSWORD_ATTEMPTS_SINCE_LAST_SUCCESSFUL_LOGON = "logon_max_wrong_password_attempts_since_last_successful_logon";
	public static final String SUPPORTED_LOCALES = "supported_locales";
	public static final String NOTIFICATION_EXPIRING_COURSE_REMINDER_PERIOD = "notification_expiring_course_reminder_period";
	public static final String NOTIFICATION_EXPIRING_COURSE_REMINDER_PERIOD_DAYS = "notification_expiring_course_reminder_period_days";
	public static final String NOTIFICATION_EXPIRING_COURSE_PARTICIPATION_REMINDER_PERIOD = "notification_expiring_course_participation_reminder_period";
	public static final String NOTIFICATION_EXPIRING_COURSE_PARTICIPATION_REMINDER_PERIOD_DAYS = "notification_expiring_course_participation_reminder_period_days";
	public static final String NOTIFICATION_EXPIRING_PASSWORD_REMINDER_PERIOD = "notification_expiring_password_reminder_period";
	public static final String NOTIFICATION_EXPIRING_PASSWORD_REMINDER_PERIOD_DAYS = "notification_expiring_password_reminder_period_days";
	public static final String NOTIFICATION_EXPIRING_PROBAND_AUTO_DELETE_REMINDER_PERIOD = "notification_expiring_proband_auto_delete_reminder_period";
	public static final String NOTIFICATION_EXPIRING_PROBAND_AUTO_DELETE_REMINDER_PERIOD_DAYS = "notification_expiring_proband_auto_delete_reminder_period_days";
	public static final String NOTIFICATION_VISIT_SCHEDULE_ITEM_REMINDER_PERIOD = "notification_visit_schedule_item_reminder_period";
	public static final String NOTIFICATION_VISIT_SCHEDULE_ITEM_REMINDER_PERIOD_DAYS = "notification_visit_schedule_item_reminder_period_days";
	public static final String EMAIL_NOTIFICATIONS_ENABLED = "email_notifications_enabled";
	public static final String EMAIL_PROCESS_NOTIFICATIONS_MAX = "email_process_notifications_max";
	public static final String EMAIL_NOTIFICATION_FROM_ADDRESS = "email_notification_from_address";
	public static final String EMAIL_NOTIFICATION_FROM_NAME = "email_notification_from_name";
	public static final String EMAIL_EXEC_FROM_ADDRESS = "email_exec_from_address";
	public static final String EMAIL_EXEC_FROM_NAME = "email_exec_from_name";
	public static final String JOURNAL_ENTRY_COMMENT_VO_DEPTH = "journal_entry_comment_vo_depth";
	public static final String JOURNAL_ENTRY_COMMENT_ENUMERATE_ENTITIES = "journal_entry_comment_enumerate_entities";
	public static final String JOURNAL_ENTRY_COMMENT_ENUMERATE_REFERENCES = "journal_entry_comment_enumerate_references";
	public static final String JOURNAL_ENTRY_COMMENT_ENUMERATE_COLLECTIONS = "journal_entry_comment_enumerate_collections";
	public static final String JOURNAL_ENTRY_COMMENT_ENUMERATE_MAPS = "journal_entry_comment_enumerate_maps";
	public static final String JOURNAL_ENTRY_COMMENT_LINE_SEPARATOR = "journal_entry_comment_line_separator";
	public static final String JOURNAL_ENTRY_COMMENT_SINGLE_LINE = "journal_entry_comment_single_line";
	public static final String JOURNAL_ENTRY_COMMENT_MULTI_LINE_HEAD = "journal_entry_comment_multi_line_head";
	public static final String JOURNAL_ENTRY_COMMENT_MULTI_LINE_TAIL = "journal_entry_comment_multi_line_tail";
	public static final String JOURNAL_ENTRY_COMMENT_NORMALIZE_MULTI_LINE_SEPARATOR = "journal_entry_comment_normalize_multi_line_separator";
	public static final String JOURNAL_ENTRY_COMMENT_DATETIME_PATTERN = "journal_entry_comment_datetime_pattern";
	public static final String JOURNAL_ENTRY_COMMENT_DATE_PATTERN = "journal_entry_comment_date_pattern";
	public static final String JOURNAL_ENTRY_COMMENT_TIME_PATTERN = "journal_entry_comment_time_pattern";
	public static final String JOURNAL_ENTRY_COMMENT_SKIP_EMPTY_FIELDS = "journal_entry_comment_skip_empty_fields";
	public static final String JOURNAL_ENTRY_COMMENT_INDENT = "journal_entry_comment_indent";
	public static final String JOURNAL_ENTRY_COMMENT_SKIP_FIELDS_WITHOUT_LOCALIZATION = "journal_entry_comment_skip_fields_without_localization";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_VO_DEPTH = "audit_trail_change_comment_vo_depth";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_ENUMERATE_ENTITIES = "audit_trail_change_comment_enumerate_entities";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_ENUMERATE_REFERENCES = "audit_trail_change_comment_enumerate_references";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_ENUMERATE_COLLECTIONS = "audit_trail_change_comment_enumerate_collections";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_ENUMERATE_MAPS = "audit_trail_change_comment_enumerate_maps";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_LINE_SEPARATOR = "audit_trail_change_comment_line_separator";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_SINGLE_LINE = "audit_trail_change_comment_single_line";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_MULTI_LINE_HEAD = "audit_trail_change_comment_multi_line_head";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_MULTI_LINE_TAIL = "audit_trail_change_comment_multi_line_tail";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_NORMALIZE_MULTI_LINE_SEPARATOR = "audit_trail_change_comment_normalize_multi_line_separator";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_DATETIME_PATTERN = "audit_trail_change_comment_datetime_pattern";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_DATE_PATTERN = "audit_trail_change_comment_date_pattern";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_TIME_PATTERN = "audit_trail_change_comment_time_pattern";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_SKIP_EMPTY_FIELDS = "audit_trail_change_comment_skip_empty_fields";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_INDENT = "audit_trail_change_comment_indent";
	public static final String AUDIT_TRAIL_CHANGE_COMMENT_SKIP_FIELDS_WITHOUT_LOCALIZATION = "audit_trail_change_comment_skip_fields_without_localization";
	public static final String NOTIFY_ALL_DEPARTMENT_RECIPIENTS = "notify_all_department_recipients";
	public static final String NOTIFY_SUPERVISOR_DUTY_ROSTER_TURN_UPDATES = "notify_supervisor_duty_roster_turn_updates";
	public static final String STAFF_INACTIVE_VISIT_SCHEDULE_ITEM_NOTIFICATION_STAFF_LIMIT = "staff_inactive_visit_schedule_item_notification_staff_limit";
	public static final String STAFF_INACTIVE_VISIT_SCHEDULE_ITEM_NOTIFICATION_PER_DAY = "staff_inactive_visit_schedule_item_notification_per_day";
	public static final String STAFF_INACTIVE_VISIT_SCHEDULE_ITEM_NOTIFICATION_ALL_TRIALS = "staff_inactive_visit_schedule_item_notification_all_trials";
	public static final String STAFF_INACTIVE_VISIT_SCHEDULE_ITEM_NOTIFICATION_ALL_STAFF = "staff_inactive_visit_schedule_item_notification_all_staff";
	public static final String NOTIFICATION_TEMPLATE_MODEL_VO_DEPTH = "notification_template_model_vo_depth";
	public static final String NOTIFICATION_TEMPLATE_MODEL_ENUMERATE_ENTITIES = "notification_template_model_enumerate_entities";
	public static final String NOTIFICATION_TEMPLATE_MODEL_DATETIME_PATTERN = "notification_template_model_datetime_pattern";
	public static final String NOTIFICATION_TEMPLATE_MODEL_DATE_PATTERN = "notification_template_model_date_pattern";
	public static final String NOTIFICATION_TEMPLATE_MODEL_TIME_PATTERN = "notification_template_model_time_pattern";
	public static final String NOTIFICATION_TEMPLATE_MODEL_OMIT_ENCRYPTED_FIELDS = "notification_template_model_omit_encrypted_fields";
	public static final String NOTIFICATION_TEMPLATE_MODEL_ENUMERATE_REFERENCES = "notification_template_model_enumerate_references";
	public static final String NOTIFICATION_TEMPLATE_MODEL_ENUMERATE_COLLECTIONS = "notification_template_model_enumerate_collections";
	public static final String NOTIFICATION_TEMPLATE_MODEL_ENUMERATE_MAPS = "notification_template_model_enumerate_maps";
	public static final String PROBAND_LIST_STATUS_REASON_DATETIME_PATTERN = "proband_list_status_reason_datetime_pattern";
	public static final String PROBAND_LAST_NAME_INDEX_LENGTH = "proband_last_name_index_length";
	public static final String HASH_FOR_SEARCH = "hash_for_search";
	public static final String ENABLE_AUTHORISATION = "enable_authorisation";
	public final static String ENABLE_HOST_BASED_AUTHORISATION = "enable_host_based_authorisation";
	public static final String TRUSTED_IP_RANGES = "trusted_ip_ranges";
	public static final String SIGNUP_FROM_UNTRUSTED_HOSTS = "signup_from_untrusted_hosts";
	public static final String SIGNATURE_COMMENT_LINE_SEPARATOR = "signature_comment_line_separator";
	public static final String SIGNATURE_COMMENT_KEY_VALUE_SEPARATOR = "signature_comment_key_value_separator";
	public static final String TRIAL_SIGNATURE_ENTITY_DEPTH = "trial_signature_entity_depth";
	public static final String ECRF_SIGNATURE_ENTITY_DEPTH = "ecrf_signature_entity_depth";
	public static final String MAX_MISSING_ECRF_FIELD_VALUES = "max_missing_ecrf_field_values";
	public static final String INPUT_FIELD_IMAGE_SIZE_LIMIT = "input_field_image_size_limit";
	public static final String INPUT_FIELD_TRUNCATED_STRING_VALUE_MAX_LENGTH = "input_field_truncated_string_value_max_length";
	public static final String BANK_CODE_NUMBER_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "bank_code_number_autocomplete_default_result_limit";
	public static final String BANK_IDENTIFICATION_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "bank_identification_autocomplete_default_result_limit";
	public static final String BANK_NAME_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "bank_name_autocomplete_default_result_limit";
	public static final String BIC_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "bic_autocomplete_default_result_limit";
	public static final String CITY_NAME_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "city_name_autocomplete_default_result_limit";
	public static final String COUNTRY_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "country_autocomplete_default_result_limit";
	public static final String CRITERIA_CATEGORY_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "criteria_category_autocomplete_default_result_limit";
	public static final String COUNTRY_NAME_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "country_name_autocomplete_default_result_limit";
	public static final String INPUT_FIELD_CATEGORY_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "input_field_category_autocomplete_default_result_limit";
	public static final String INPUT_FIELD_SELECTION_SET_VALUE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "input_field_selection_set_value_autocomplete_default_result_limit";
	public static final String INPUT_FIELD_TEXT_VALUE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "input_field_text_value_autocomplete_default_result_limit";
	public static final String INQUIRY_CATEGORY_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "inquiry_category_autocomplete_default_result_limit";
	public static final String ECRF_FIELD_SECTION_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "ecrf_field_section_autocomplete_default_result_limit";
	public static final String STREET_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "street_autocomplete_default_result_limit";
	public static final String STREET_NAME_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "street_name_autocomplete_default_result_limit";
	public static final String TITLE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "title_autocomplete_default_result_limit";
	public static final String ZIP_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "zip_autocomplete_default_result_limit";
	public static final String ZIP_CODE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "zip_code_autocomplete_default_result_limit";
	public static final String FILE_FOLDER_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "file_folder_autocomplete_default_result_limit";
	public static final String MONEY_TRANSFER_COST_TYPE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "money_transfer_cost_type_autocomplete_default_result_limit";
	public static final String ALPHA_ID_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "alpha_id_autocomplete_default_result_limit";
	public static final String ALPHA_ID_TEXT_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "alpha_id_text_autocomplete_default_result_limit";
	public static final String ALPHA_ID_CODE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "alpha_id_code_autocomplete_default_result_limit";
	public static final String OPS_CODE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "ops_code_autocomplete_default_result_limit";
	public static final String OPS_CODE_TEXT_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "ops_code_text_autocomplete_default_result_limit";
	public static final String OPS_CODE_CODE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "ops_code_code_autocomplete_default_result_limit";
	public static final String ICD_SYST_BLOCK_PREFERRED_RUBRIC_LABEL_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "icd_syst_block_preferred_rubric_label_autocomplete_default_result_limit";
	public static final String ICD_SYST_CATEGORY_PREFERRED_RUBRIC_LABEL_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "icd_syst_category_preferred_rubric_label_autocomplete_default_result_limit";
	public static final String OPS_SYST_BLOCK_PREFERRED_RUBRIC_LABEL_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "ops_syst_block_preferred_rubric_label_autocomplete_default_result_limit";
	public static final String OPS_SYST_CATEGORY_PREFERRED_RUBRIC_LABEL_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "ops_syst_category_preferred_rubric_label_autocomplete_default_result_limit";
	public static final String ASP_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "asp_autocomplete_default_result_limit";
	public static final String ASP_NAME_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "asp_name_autocomplete_default_result_limit";
	public static final String ASP_SUBSTANCE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "asp_substance_autocomplete_default_result_limit";
	public static final String ASP_SUBSTANCE_NAME_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "asp_substance_name_autocomplete_default_result_limit";
	public static final String ASP_ATC_CODE_CODE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "asp_atc_code_code_autocomplete_default_result_limit";
	public static final String MEDICATION_DOSE_UNIT_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "medication_dose_unit_autocomplete_default_result_limit";
	public static final String DUTY_ROSTER_TURN_CALENDAR_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "duty_roster_turn_calendar_autocomplete_default_result_limit";
	public static final String DUTY_ROSTER_TURN_TITLE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "duty_roster_turn_title_autocomplete_default_result_limit";
	public static final String INVENTORY_BOOKING_CALENDAR_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "inventory_booking_calendar_autocomplete_default_result_limit";
	public static final String LDAP_ENTRIES_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "ldap_entries_autocomplete_default_result_limit";
	public static final String PROBAND_LIST_ENTRY_TAG_FIELD_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "proband_list_entry_tag_field_autocomplete_default_result_limit";
	public static final String INQUIRY_FIELD_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "inquiry_field_autocomplete_default_result_limit";
	public static final String INPUT_FIELD_SELECTION_SET_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "input_field_selection_set_autocomplete_default_result_limit";
	public static final String ECRF_FIELD_FIELD_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "ecrf_field_field_autocomplete_default_result_limit";
	public static final String SYSTEM_MESSAGE_CODE_AUTOCOMPLETE_DEFAULT_RESULT_LIMIT = "system_message_code_autocomplete_default_result_limit";
	public static final String OPS_CODE_REVISION = "ops_code_revision";
	public static final String ALPHA_ID_REVISION = "alpha_id_revision";
	public static final String ASP_REVISION = "asp_revision";
	public static final String PROBAND_AUTODELETE_GRACE_PERIOD = "proband_autodelete_grace_period";
	public static final String PROBAND_AUTODELETE_GRACE_PERIOD_DAYS = "proband_autodelete_grace_period_days";
	public static final String STAFF_IMAGE_SIZE_LIMIT = "staff_image_size_limit";
	public static final String STAFF_IMAGE_MIN_WIDTH = "staff_image_min_width";
	public static final String STAFF_IMAGE_MIN_HEIGHT = "staff_image_min_height";
	public static final String PROBAND_IMAGE_SIZE_LIMIT = "proband_image_size_limit";
	public static final String PROBAND_IMAGE_MIN_WIDTH = "proband_image_min_width";
	public static final String PROBAND_IMAGE_MIN_HEIGHT = "proband_image_min_height";
	public static final String PDFBOX_PUSH_BACK_SIZE = "pdfbox_push_back_size";
	public static final String LOG_SEARCH_FILTERED = "log_search_filtered";
	public static final String ENABLE_SERVICE_EXCEPTION_LOGGER = "enable_service_exception_logger";
	public static final String ENABLE_AUTHENTICATION_EXCEPTION_LOGGER = "enable_authentication_exception_logger";
	public static final String ENABLE_AUTHORISATION_EXCEPTION_LOGGER = "enable_authorisation_exception_logger";
	public static final String ENABLE_OTHER_EXCEPTION_LOGGER = "enable_other_exception_logger";
	public static final String BOOKING_SUMMARY_FULL_BOOKINGS = "booking_summary_full_bookings";
	public static final String BOOKING_SUMMARY_FULL_UNAVAILABILITIES = "booking_summary_full_unavailabilities";
	public static final String BOOKING_SUMMARY_MERGE_OVERLAPPING = "booking_summary_merge_overlapping";
	public static final String SHIFT_SUMMARY_FULL_SHIFTS = "shift_summary_full_shifts";
	public static final String SHIFT_SUMMARY_FULL_ABSENCES = "shift_summary_full_absences";
	public static final String RECENT_JOURNAL_ENTRY_PERIOD = "recent_journal_entry_period";
	public static final String RECENT_JOURNAL_ENTRY_PERIOD_DAYS = "recent_journal_entry_period_days";
	public static final String EXCEPTION_DATE_TIME_PATTERN = "exception_date_time_pattern";
	public static final String EXCEPTION_DATE_PATTERN = "exception_date_pattern";
	public static final String EMAIL_PROCESS_NOTIFICATIONS_DELAY_MILLIS = "email_process_notifications_delay_millis";
	public static final String CURRENCY_SYMBOL = "currency_symbol";
	public static final String UPDATE_INPUT_FIELD_CHECK_PROBAND_TRIAL_LOCKED = "update_input_field_check_proband_trial_locked";
	public static final String REMOVE_PROBAND_CHECK_TRIAL_LOCKED = "remove_proband_check_trial_locked";
	public static final String REMOVE_ECRF_CHECK_PROBAND_LOCKED = "remove_ecrf_check_proband_locked";
	public static final String REMOVE_INQUIRY_CHECK_PROBAND_LOCKED = "remove_inquiry_check_proband_locked";
	public static final String REMOVE_LIST_ENTRY_TAG_CHECK_PROBAND_LOCKED = "remove_list_entry_tag_check_proband_locked";
	public static final String REMOVE_TRIAL_CHECK_PROBAND_LOCKED = "remove_trial_check_proband_locked";
	public static final String UNIQUE_ECRF_NAMES = "unique_ecrf_names";
	public static final String SIGNATURE_DESCRIPTION_DATETIME_PATTERN = "signature_description_datetime_pattern";
	// public static final String FIELD_CALCULATION_JS_FILE_NAME = "field_calculation_js_file_name";
	// public static final String SPRINTF_JS_FILE_NAME = "sprintf_js_file_name";
	// public static final String ENV_JS_FILE_NAME = "env_js_file_name";
	// public static final String DATE_JS_FILE_NAME = "date_js_file_name";
	// public static final String TIME_JS_FILE_NAME = "time_js_file_name";
	// public static final String STRIP_COMMENTS_JS_FILE_NAME = "strip_comments_js_file_name";
	// public static final String JQUERY_BASE64_JS_FILE_NAME = "jquery_base64_js_file_name";
	// public static final String REST_API_SHIM_JS_FILE_NAME = "rest_api_shim_js_file_name";
	// public static final String LOCATION_DISTANCE_SHIM_JS_FILE_NAME = "location_distance_shim_js_file_name";
	public static final String INQUIRY_VALUES_ENABLE_BROWSER_FIELD_CALCULATION = "inquiry_values_enable_browser_field_calculation";
	public static final String PROBAND_LIST_ENTRY_TAG_VALUES_ENABLE_BROWSER_FIELD_CALCULATION = "proband_list_entry_tag_values_enable_browser_field_calculation";
	public static final String ECRF_FIELD_VALUES_ENABLE_BROWSER_FIELD_CALCULATION = "ecrf_field_values_enable_browser_field_calculation";
	public static final String NEW_ECRF_FIELD_STATUS_NOTIFICATION_QUEUES = "new_ecrf_field_status_notification_queues";
	public static final String ECRF_FIELD_VALUES_SCHEDULE_VALIDATION_LIMIT = "ecrf_field_values_schedule_validation_limit";
	public static final String RESOLVE_ECRF_FIELD_STATUS_RESTRICTION_QUEUES = "resolve_ecrf_field_status_restriction_queues";
	// public static final String ECRF_JOURNAL_ENTRY_TITLE_REGEXP = "ecrf_journal_entry_title_regexp";
	public static final String REMOVE_MASS_MAIL_CHECK_PROBAND_LOCKED = "remove_mass_mail_check_proband_locked";
	public static final String REMOVE_PROBAND_KEEP_SENT_MASS_MAIL_RECIPIENTS = "remove_proband_keep_sent_mass_mail_recipients";

	public static final String MASS_MAIL_TEMPLATE_MODEL_VO_DEPTH = "mass_mail_template_model_vo_depth";
	public static final String MASS_MAIL_TEMPLATE_MODEL_ENUMERATE_ENTITIES = "mass_mail_template_model_enumerate_entities";
	public static final String MASS_MAIL_TEMPLATE_MODEL_DATETIME_PATTERN = "mass_mail_template_model_datetime_pattern";
	public static final String MASS_MAIL_TEMPLATE_MODEL_DATE_PATTERN = "mass_mail_template_model_date_pattern";
	public static final String MASS_MAIL_TEMPLATE_MODEL_TIME_PATTERN = "mass_mail_template_model_time_pattern";
	public static final String MASS_MAIL_TEMPLATE_MODEL_OMIT_ENCRYPTED_FIELDS = "mass_mail_template_model_omit_encrypted_fields";
	public static final String MASS_MAIL_TEMPLATE_MODEL_ENUMERATE_REFERENCES = "mass_mail_template_model_enumerate_references";
	public static final String MASS_MAIL_TEMPLATE_MODEL_ENUMERATE_COLLECTIONS = "mass_mail_template_model_enumerate_collections";
	public static final String MASS_MAIL_TEMPLATE_MODEL_ENUMERATE_MAPS = "mass_mail_template_model_enumerate_maps";
	public static final String SEND_MASS_MAILS = "send_mass_mails";
	public static final String EMAIL_PROCESS_MASS_MAILS_DELAY_MILLIS = "email_process_mass_mails_delay_millis";
	public static final String EMAIL_PROCESS_MASS_MAILS_MAX = "email_process_mass_mails_max";
	public static final String MASS_MAIL_MIME_MESSAGE_MAX_AGE_SECONDS = "mass_mail_mime_message_max_age_seconds";
	public static final String RESOLVE_MAIL_ADDRESS_DOMAIN_NAME = "resolve_mail_address_domain_name";
}
